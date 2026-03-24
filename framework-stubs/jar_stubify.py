#!/usr/bin/env python3
"""
jar_stubify.py — Generate compilable Java stub sources from a JAR of .class files.

Creted with Claude after consuming enough water to dry up the entire Amazon rainforest,
and by channeling the full, concentrated power of the SUN

Reads every .class in the input JAR, parses the bytecode (constant pool, fields,
methods, generics via Signature attributes, annotations, inner-class relationships,
enum constants, etc.) and emits a tree of .java source files that compile to an
API-compatible stub JAR.

Usage:
    python jar_stubify.py <input.jar> <output_dir> [--fake-deps]

Options:
    --fake-deps   Also generate minimal fake stubs for external dependencies
                  (classes referenced but not present in the JAR) so the output
                  compiles as a fully standalone project.

Requirements: Python 3.8+  (stdlib only, no third-party packages)
"""

from __future__ import annotations

import io
import os
import re
import struct
import sys
import zipfile
from collections import defaultdict
from dataclasses import dataclass, field
from typing import Any, Dict, List, Optional, Set, Tuple

# ── JVM access-flag constants ────────────────────────────────────────────────

ACC_PUBLIC       = 0x0001
ACC_PRIVATE      = 0x0002
ACC_PROTECTED    = 0x0004
ACC_STATIC       = 0x0008
ACC_FINAL        = 0x0010
ACC_SUPER        = 0x0020  # class-level only (not meaningful for stubs)
ACC_SYNCHRONIZED = 0x0020  # method-level
ACC_VOLATILE     = 0x0040
ACC_BRIDGE       = 0x0040  # method
ACC_TRANSIENT    = 0x0080
ACC_VARARGS      = 0x0080  # method
ACC_NATIVE       = 0x0100
ACC_INTERFACE    = 0x0200
ACC_ABSTRACT     = 0x0400
ACC_STRICT       = 0x0800
ACC_SYNTHETIC    = 0x1000
ACC_ANNOTATION   = 0x2000
ACC_ENUM         = 0x4000
ACC_MODULE       = 0x8000

# ── Constant-pool tag values ─────────────────────────────────────────────────

CONSTANT_Utf8               = 1
CONSTANT_Integer            = 3
CONSTANT_Float              = 4
CONSTANT_Long               = 5
CONSTANT_Double             = 6
CONSTANT_Class              = 7
CONSTANT_String             = 8
CONSTANT_Fieldref           = 9
CONSTANT_Methodref          = 10
CONSTANT_InterfaceMethodref = 11
CONSTANT_NameAndType        = 12
CONSTANT_MethodHandle       = 15
CONSTANT_MethodType         = 16
CONSTANT_Dynamic            = 17
CONSTANT_InvokeDynamic      = 18
CONSTANT_Module             = 19
CONSTANT_Package            = 20

# ── Data classes ─────────────────────────────────────────────────────────────

@dataclass
class AnnotationValue:
    """Represents a single element-value inside an annotation."""
    tag: str
    value: Any  # varies by tag

@dataclass
class AnnotationInfo:
    """Represents a single annotation occurrence."""
    type_descriptor: str  # e.g. "Ljava/lang/Deprecated;"
    elements: Dict[str, AnnotationValue] = field(default_factory=dict)

@dataclass
class FieldInfo:
    access_flags: int
    name: str
    descriptor: str
    signature: Optional[str] = None  # generic
    constant_value: Any = None       # compile-time constant
    annotations: List[AnnotationInfo] = field(default_factory=list)

@dataclass
class MethodInfo:
    access_flags: int
    name: str
    descriptor: str
    signature: Optional[str] = None
    exceptions: List[str] = field(default_factory=list)
    annotation_default: Optional[AnnotationValue] = None
    annotations: List[AnnotationInfo] = field(default_factory=list)
    param_annotations: List[List[AnnotationInfo]] = field(default_factory=list)

@dataclass
class InnerClassEntry:
    inner_class: str
    outer_class: Optional[str]
    inner_name: Optional[str]
    inner_access_flags: int

@dataclass
class ClassInfo:
    version_major: int = 0
    version_minor: int = 0
    access_flags: int = 0
    this_class: str = ""
    super_class: Optional[str] = None
    interfaces: List[str] = field(default_factory=list)
    fields: List[FieldInfo] = field(default_factory=list)
    methods: List[MethodInfo] = field(default_factory=list)
    signature: Optional[str] = None  # class-level generic signature
    inner_classes: List[InnerClassEntry] = field(default_factory=list)
    annotations: List[AnnotationInfo] = field(default_factory=list)
    source_file: Optional[str] = None
    is_deprecated: bool = False
    enclosing_method: Optional[Tuple[str, Optional[str], Optional[str]]] = None
    nest_host: Optional[str] = None
    nest_members: List[str] = field(default_factory=list)
    permitted_subclasses: List[str] = field(default_factory=list)
    is_record: bool = False
    record_components: List[Tuple[str,str,Optional[str]]] = field(default_factory=list)


# ── Class-file parser ────────────────────────────────────────────────────────

class ClassFileReader:
    """Parses a single .class byte buffer into a ClassInfo."""

    def __init__(self, data: bytes):
        self._data = data
        self._pos = 0
        self._cp: Dict[int, Any] = {}  # constant pool (1-based)

    # -- primitive readers --------------------------------------------------

    def _u1(self) -> int:
        v = self._data[self._pos]
        self._pos += 1
        return v

    def _u2(self) -> int:
        v = struct.unpack_from(">H", self._data, self._pos)[0]
        self._pos += 2
        return v

    def _u4(self) -> int:
        v = struct.unpack_from(">I", self._data, self._pos)[0]
        self._pos += 4
        return v

    def _s4(self) -> int:
        v = struct.unpack_from(">i", self._data, self._pos)[0]
        self._pos += 4
        return v

    def _s8(self) -> int:
        v = struct.unpack_from(">q", self._data, self._pos)[0]
        self._pos += 8
        return v

    def _f4(self) -> float:
        v = struct.unpack_from(">f", self._data, self._pos)[0]
        self._pos += 4
        return v

    def _f8(self) -> float:
        v = struct.unpack_from(">d", self._data, self._pos)[0]
        self._pos += 8
        return v

    def _bytes(self, n: int) -> bytes:
        v = self._data[self._pos:self._pos + n]
        self._pos += n
        return v

    # -- constant pool resolution -------------------------------------------

    def _cp_utf8(self, idx: int) -> str:
        tag, val = self._cp[idx]
        assert tag == CONSTANT_Utf8, f"Expected Utf8 at #{idx}, got tag {tag}"
        return val

    def _cp_class_name(self, idx: int) -> str:
        if idx == 0:
            return ""
        tag, name_idx = self._cp[idx]
        assert tag == CONSTANT_Class, f"Expected Class at #{idx}, got tag {tag}"
        return self._cp_utf8(name_idx)

    # -- constant pool parsing ----------------------------------------------

    def _read_constant_pool(self):
        count = self._u2()
        i = 1
        while i < count:
            tag = self._u1()
            if tag == CONSTANT_Utf8:
                length = self._u2()
                # Modified UTF-8 — for our purposes plain decode is fine
                raw = self._bytes(length)
                try:
                    val = raw.decode("utf-8")
                except UnicodeDecodeError:
                    val = raw.decode("latin-1")
                self._cp[i] = (tag, val)
            elif tag == CONSTANT_Integer:
                self._cp[i] = (tag, self._s4())
            elif tag == CONSTANT_Float:
                self._cp[i] = (tag, self._f4())
            elif tag == CONSTANT_Long:
                self._cp[i] = (tag, self._s8())
                i += 1  # longs take two slots
                self._cp[i] = (0, None)  # placeholder
            elif tag == CONSTANT_Double:
                self._cp[i] = (tag, self._f8())
                i += 1
                self._cp[i] = (0, None)
            elif tag == CONSTANT_Class:
                self._cp[i] = (tag, self._u2())
            elif tag == CONSTANT_String:
                self._cp[i] = (tag, self._u2())
            elif tag in (CONSTANT_Fieldref, CONSTANT_Methodref,
                         CONSTANT_InterfaceMethodref):
                class_idx = self._u2()
                nat_idx = self._u2()
                self._cp[i] = (tag, (class_idx, nat_idx))
            elif tag == CONSTANT_NameAndType:
                name_idx = self._u2()
                desc_idx = self._u2()
                self._cp[i] = (tag, (name_idx, desc_idx))
            elif tag == CONSTANT_MethodHandle:
                ref_kind = self._u1()
                ref_idx = self._u2()
                self._cp[i] = (tag, (ref_kind, ref_idx))
            elif tag == CONSTANT_MethodType:
                self._cp[i] = (tag, self._u2())
            elif tag in (CONSTANT_Dynamic, CONSTANT_InvokeDynamic):
                bootstrap_idx = self._u2()
                nat_idx = self._u2()
                self._cp[i] = (tag, (bootstrap_idx, nat_idx))
            elif tag == CONSTANT_Module:
                self._cp[i] = (tag, self._u2())
            elif tag == CONSTANT_Package:
                self._cp[i] = (tag, self._u2())
            else:
                raise ValueError(f"Unknown constant pool tag {tag} at index {i}")
            i += 1

    # -- annotation parsing -------------------------------------------------

    def _read_element_value(self) -> AnnotationValue:
        tag = chr(self._u1())
        if tag in "BCDFIJSZs":
            idx = self._u2()
            cp_tag, cp_val = self._cp[idx]
            if tag == 's':
                return AnnotationValue(tag, self._cp_utf8(idx))
            else:
                return AnnotationValue(tag, cp_val)
        elif tag == 'e':
            type_name_idx = self._u2()
            const_name_idx = self._u2()
            return AnnotationValue(tag, (self._cp_utf8(type_name_idx),
                                         self._cp_utf8(const_name_idx)))
        elif tag == 'c':
            class_info_idx = self._u2()
            return AnnotationValue(tag, self._cp_utf8(class_info_idx))
        elif tag == '@':
            ann = self._read_annotation()
            return AnnotationValue(tag, ann)
        elif tag == '[':
            num = self._u2()
            vals = [self._read_element_value() for _ in range(num)]
            return AnnotationValue(tag, vals)
        else:
            raise ValueError(f"Unknown element_value tag '{tag}'")

    def _read_annotation(self) -> AnnotationInfo:
        type_idx = self._u2()
        type_desc = self._cp_utf8(type_idx)
        num_pairs = self._u2()
        elements: Dict[str, AnnotationValue] = {}
        for _ in range(num_pairs):
            name_idx = self._u2()
            name = self._cp_utf8(name_idx)
            val = self._read_element_value()
            elements[name] = val
        return AnnotationInfo(type_desc, elements)

    def _read_annotations_attr(self) -> List[AnnotationInfo]:
        num = self._u2()
        return [self._read_annotation() for _ in range(num)]

    def _read_param_annotations_attr(self) -> List[List[AnnotationInfo]]:
        num_params = self._u1()
        result = []
        for _ in range(num_params):
            num_ann = self._u2()
            result.append([self._read_annotation() for _ in range(num_ann)])
        return result

    # -- attribute parsing --------------------------------------------------

    def _read_attributes(self) -> List[Tuple[str, bytes]]:
        count = self._u2()
        attrs = []
        for _ in range(count):
            name_idx = self._u2()
            name = self._cp_utf8(name_idx)
            length = self._u4()
            data = self._bytes(length)
            attrs.append((name, data))
        return attrs

    def _parse_field_attributes(self, fi: FieldInfo, attrs: List[Tuple[str, bytes]]):
        for name, data in attrs:
            if name == "Signature":
                idx = struct.unpack_from(">H", data, 0)[0]
                fi.signature = self._cp_utf8(idx)
            elif name == "ConstantValue":
                idx = struct.unpack_from(">H", data, 0)[0]
                cp_tag, cp_val = self._cp[idx]
                if cp_tag == CONSTANT_String:
                    fi.constant_value = ("String", self._cp_utf8(cp_val))
                elif cp_tag == CONSTANT_Integer:
                    fi.constant_value = ("int", cp_val)
                elif cp_tag == CONSTANT_Long:
                    fi.constant_value = ("long", cp_val)
                elif cp_tag == CONSTANT_Float:
                    fi.constant_value = ("float", cp_val)
                elif cp_tag == CONSTANT_Double:
                    fi.constant_value = ("double", cp_val)
            elif name in ("RuntimeVisibleAnnotations", "RuntimeInvisibleAnnotations"):
                saved = self._pos
                self._pos = 0
                old_data = self._data
                self._data = data
                fi.annotations.extend(self._read_annotations_attr())
                self._data = old_data
                self._pos = saved
            elif name == "Deprecated":
                pass  # handled via annotation

    def _parse_method_attributes(self, mi: MethodInfo, attrs: List[Tuple[str, bytes]]):
        for name, data in attrs:
            if name == "Signature":
                idx = struct.unpack_from(">H", data, 0)[0]
                mi.signature = self._cp_utf8(idx)
            elif name == "Exceptions":
                saved = self._pos
                self._pos = 0
                old_data = self._data
                self._data = data
                num = self._u2()
                for _ in range(num):
                    exc_idx = self._u2()
                    mi.exceptions.append(self._cp_class_name(exc_idx))
                self._data = old_data
                self._pos = saved
            elif name in ("RuntimeVisibleAnnotations", "RuntimeInvisibleAnnotations"):
                saved = self._pos
                self._pos = 0
                old_data = self._data
                self._data = data
                mi.annotations.extend(self._read_annotations_attr())
                self._data = old_data
                self._pos = saved
            elif name in ("RuntimeVisibleParameterAnnotations",
                          "RuntimeInvisibleParameterAnnotations"):
                saved = self._pos
                self._pos = 0
                old_data = self._data
                self._data = data
                mi.param_annotations = self._read_param_annotations_attr()
                self._data = old_data
                self._pos = saved
            elif name == "AnnotationDefault":
                saved = self._pos
                self._pos = 0
                old_data = self._data
                self._data = data
                mi.annotation_default = self._read_element_value()
                self._data = old_data
                self._pos = saved

    # -- main parse entry point ---------------------------------------------

    def parse(self) -> ClassInfo:
        ci = ClassInfo()

        magic = self._u4()
        if magic != 0xCAFEBABE:
            raise ValueError(f"Bad magic: {hex(magic)}")

        ci.version_minor = self._u2()
        ci.version_major = self._u2()

        self._read_constant_pool()

        ci.access_flags = self._u2()
        ci.this_class = self._cp_class_name(self._u2())

        super_idx = self._u2()
        ci.super_class = self._cp_class_name(super_idx) if super_idx != 0 else None

        iface_count = self._u2()
        for _ in range(iface_count):
            ci.interfaces.append(self._cp_class_name(self._u2()))

        # Fields
        field_count = self._u2()
        for _ in range(field_count):
            f_flags = self._u2()
            f_name = self._cp_utf8(self._u2())
            f_desc = self._cp_utf8(self._u2())
            fi = FieldInfo(f_flags, f_name, f_desc)
            f_attrs = self._read_attributes()
            self._parse_field_attributes(fi, f_attrs)
            ci.fields.append(fi)

        # Methods
        method_count = self._u2()
        for _ in range(method_count):
            m_flags = self._u2()
            m_name = self._cp_utf8(self._u2())
            m_desc = self._cp_utf8(self._u2())
            mi = MethodInfo(m_flags, m_name, m_desc)
            m_attrs = self._read_attributes()
            self._parse_method_attributes(mi, m_attrs)
            ci.methods.append(mi)

        # Class attributes
        class_attrs = self._read_attributes()
        for attr_name, attr_data in class_attrs:
            if attr_name == "Signature":
                idx = struct.unpack_from(">H", attr_data, 0)[0]
                ci.signature = self._cp_utf8(idx)
            elif attr_name == "InnerClasses":
                saved = self._pos
                self._pos = 0
                old_data = self._data
                self._data = attr_data
                num = self._u2()
                for _ in range(num):
                    inner_idx = self._u2()
                    outer_idx = self._u2()
                    name_idx = self._u2()
                    flags = self._u2()
                    inner_name = self._cp_class_name(inner_idx) if inner_idx else None
                    outer_name = self._cp_class_name(outer_idx) if outer_idx else None
                    simple_name = self._cp_utf8(name_idx) if name_idx else None
                    ci.inner_classes.append(InnerClassEntry(
                        inner_name or "", outer_name, simple_name, flags))
                self._data = old_data
                self._pos = saved
            elif attr_name in ("RuntimeVisibleAnnotations",
                               "RuntimeInvisibleAnnotations"):
                saved = self._pos
                self._pos = 0
                old_data = self._data
                self._data = attr_data
                ci.annotations.extend(self._read_annotations_attr())
                self._data = old_data
                self._pos = saved
            elif attr_name == "SourceFile":
                idx = struct.unpack_from(">H", attr_data, 0)[0]
                ci.source_file = self._cp_utf8(idx)
            elif attr_name == "Deprecated":
                ci.is_deprecated = True
            elif attr_name == "EnclosingMethod":
                enc_class_idx = struct.unpack_from(">H", attr_data, 0)[0]
                enc_method_idx = struct.unpack_from(">H", attr_data, 2)[0]
                enc_class = self._cp_class_name(enc_class_idx) if enc_class_idx else None
                enc_method_name = None
                enc_method_desc = None
                if enc_method_idx:
                    tag, (ni, di) = self._cp[enc_method_idx]
                    enc_method_name = self._cp_utf8(ni)
                    enc_method_desc = self._cp_utf8(di)
                ci.enclosing_method = (enc_class, enc_method_name, enc_method_desc)
            elif attr_name == "NestHost":
                idx = struct.unpack_from(">H", attr_data, 0)[0]
                ci.nest_host = self._cp_class_name(idx)
            elif attr_name == "NestMembers":
                saved = self._pos
                self._pos = 0
                old_data = self._data
                self._data = attr_data
                num = self._u2()
                for _ in range(num):
                    ci.nest_members.append(self._cp_class_name(self._u2()))
                self._data = old_data
                self._pos = saved
            elif attr_name == "PermittedSubclasses":
                saved = self._pos
                self._pos = 0
                old_data = self._data
                self._data = attr_data
                num = self._u2()
                for _ in range(num):
                    ci.permitted_subclasses.append(self._cp_class_name(self._u2()))
                self._data = old_data
                self._pos = saved
            elif attr_name == "Record":
                ci.is_record = True
                saved = self._pos
                self._pos = 0
                old_data = self._data
                self._data = attr_data
                num = self._u2()
                for _ in range(num):
                    comp_name = self._cp_utf8(self._u2())
                    comp_desc = self._cp_utf8(self._u2())
                    comp_attrs = self._read_attributes()
                    comp_sig = None
                    for ca_name, ca_data in comp_attrs:
                        if ca_name == "Signature":
                            comp_sig = self._cp_utf8(struct.unpack_from(">H", ca_data, 0)[0])
                    ci.record_components.append((comp_name, comp_desc, comp_sig))
                self._data = old_data
                self._pos = saved

        return ci


# ── Descriptor / signature parsing ───────────────────────────────────────────

def _parse_base_type(desc: str, pos: int) -> Tuple[str, int]:
    """Parse one type from a field/method descriptor. Returns (java_type, new_pos)."""
    c = desc[pos]
    if c == 'B': return ("byte", pos + 1)
    if c == 'C': return ("char", pos + 1)
    if c == 'D': return ("double", pos + 1)
    if c == 'F': return ("float", pos + 1)
    if c == 'I': return ("int", pos + 1)
    if c == 'J': return ("long", pos + 1)
    if c == 'S': return ("short", pos + 1)
    if c == 'Z': return ("boolean", pos + 1)
    if c == 'V': return ("void", pos + 1)
    if c == 'L':
        end = desc.index(';', pos)
        class_name = desc[pos + 1:end].replace('/', '.').replace('$', '.')
        return (class_name, end + 1)
    if c == '[':
        inner, npos = _parse_base_type(desc, pos + 1)
        return (inner + "[]", npos)
    raise ValueError(f"Bad descriptor char '{c}' in '{desc}' at {pos}")


def descriptor_to_java(desc: str) -> str:
    """Convert a single field descriptor like 'Ljava/lang/String;' to 'java.lang.String'."""
    t, _ = _parse_base_type(desc, 0)
    return t


def parse_method_descriptor(desc: str) -> Tuple[List[str], str]:
    """Parse '(II)V' → (['int','int'], 'void')."""
    assert desc[0] == '('
    pos = 1
    params: List[str] = []
    while desc[pos] != ')':
        t, pos = _parse_base_type(desc, pos)
        params.append(t)
    pos += 1  # skip ')'
    ret, _ = _parse_base_type(desc, pos)
    return params, ret


# ── Generic signature parser (Java 5+ Signature attribute) ───────────────────

class SignatureParser:
    """
    Parses JVM generic signatures (JVMS §4.7.9.1) into Java source text.
    This handles the full grammar: type params, class/method sigs, wildcards, etc.
    """

    def __init__(self, sig: str):
        self.sig = sig
        self.pos = 0

    def _peek(self) -> str:
        return self.sig[self.pos] if self.pos < len(self.sig) else ''

    def _read(self) -> str:
        c = self.sig[self.pos]
        self.pos += 1
        return c

    def _expect(self, c: str):
        actual = self._read()
        if actual != c:
            raise ValueError(
                f"Expected '{c}' got '{actual}' at pos {self.pos - 1} in '{self.sig}'")

    def parse_class_signature(self) -> Tuple[str, str, List[str]]:
        """Returns (type_params_str, superclass, [interfaces])."""
        tp = ""
        if self._peek() == '<':
            tp = self._parse_type_params()
        super_cls = self._parse_class_type_sig()
        ifaces = []
        while self.pos < len(self.sig):
            ifaces.append(self._parse_class_type_sig())
        return tp, super_cls, ifaces

    def parse_method_signature(self) -> Tuple[str, List[str], str, List[str]]:
        """Returns (type_params_str, [param_types], return_type, [throws])."""
        tp = ""
        if self._peek() == '<':
            tp = self._parse_type_params()
        self._expect('(')
        params = []
        while self._peek() != ')':
            params.append(self._parse_type_sig())
        self._expect(')')
        ret = self._parse_type_sig()
        throws = []
        while self.pos < len(self.sig) and self._peek() == '^':
            self._read()  # skip '^'
            if self._peek() == 'T':
                throws.append(self._parse_type_var())
            else:
                throws.append(self._parse_class_type_sig())
        return tp, params, ret, throws

    def parse_field_signature(self) -> str:
        return self._parse_type_sig()

    def _parse_type_params(self) -> str:
        self._expect('<')
        parts = []
        while self._peek() != '>':
            parts.append(self._parse_type_param())
        self._expect('>')
        return '<' + ', '.join(parts) + '>'

    def _parse_type_param(self) -> str:
        # Identifier ':' classBound interfaceBound*
        name = self._read_identifier()
        self._expect(':')
        bounds = []
        # Class bound (may be empty)
        if self._peek() not in (':', '>'):
            bounds.append(self._parse_type_sig())
        # Interface bounds
        while self._peek() == ':':
            self._read()
            bounds.append(self._parse_type_sig())
        if bounds:
            return name + " extends " + " & ".join(bounds)
        return name

    def _read_identifier(self) -> str:
        start = self.pos
        while self.pos < len(self.sig) and self.sig[self.pos] not in ':;<>/.[':
            self.pos += 1
        return self.sig[start:self.pos]

    def _parse_type_sig(self) -> str:
        c = self._peek()
        if c in 'BCDFIJSZV':
            self._read()
            m = {'B': 'byte', 'C': 'char', 'D': 'double', 'F': 'float',
                 'I': 'int', 'J': 'long', 'S': 'short', 'Z': 'boolean', 'V': 'void'}
            return m[c]
        if c == 'L':
            return self._parse_class_type_sig()
        if c == 'T':
            return self._parse_type_var()
        if c == '[':
            self._read()
            inner = self._parse_type_sig()
            return inner + "[]"
        if c == '*':
            self._read()
            return "?"
        if c == '+':
            self._read()
            inner = self._parse_type_sig()
            return "? extends " + inner
        if c == '-':
            self._read()
            inner = self._parse_type_sig()
            return "? super " + inner
        raise ValueError(f"Unexpected '{c}' at {self.pos} in sig '{self.sig}'")

    def _parse_type_var(self) -> str:
        self._expect('T')
        name = self._read_identifier()
        self._expect(';')
        return name

    def _parse_class_type_sig(self) -> str:
        self._expect('L')
        # Read package/class name segments
        name_parts = []
        current = ""
        while True:
            c = self._read()
            if c == '/':
                name_parts.append(current)
                current = ""
            elif c in ('.', '$'):
                # Inner class (JVM uses both . and $ as separators)
                name_parts.append(current)
                current = ""
            elif c == '<':
                # Type arguments
                self.pos -= 1
                break
            elif c == ';':
                name_parts.append(current)
                return '.'.join(name_parts)
            else:
                current += c

        name_parts.append(current)
        base = '.'.join(name_parts)

        # Type arguments
        type_args = self._parse_type_arguments()
        result = base + type_args

        # Handle inner class suffixes after type args: .InnerName<...>
        while self._peek() == '.':
            self._read()
            inner_name = ""
            while self._peek() not in '<;.':
                inner_name += self._read()
            result += "." + inner_name
            if self._peek() == '<':
                result += self._parse_type_arguments()

        self._expect(';')
        return result

    def _parse_type_arguments(self) -> str:
        self._expect('<')
        args = []
        while self._peek() != '>':
            args.append(self._parse_type_sig())
        self._expect('>')
        return '<' + ', '.join(args) + '>'


def parse_generic_class_sig(sig: str):
    """Returns (type_params, super_type, [interface_types]) or None on failure."""
    try:
        p = SignatureParser(sig)
        return p.parse_class_signature()
    except Exception:
        return None


def parse_generic_method_sig(sig: str):
    """Returns (type_params, [param_types], return_type, [throws]) or None."""
    try:
        p = SignatureParser(sig)
        return p.parse_method_signature()
    except Exception:
        return None


def parse_generic_field_sig(sig: str) -> Optional[str]:
    try:
        p = SignatureParser(sig)
        return p.parse_field_signature()
    except Exception:
        return None


# ── Java source emitter ──────────────────────────────────────────────────────

JAVA_KEYWORDS = {
    "abstract", "assert", "boolean", "break", "byte", "case", "catch", "char",
    "class", "const", "continue", "default", "do", "double", "else", "enum",
    "extends", "final", "finally", "float", "for", "goto", "if", "implements",
    "import", "instanceof", "int", "interface", "long", "native", "new",
    "package", "private", "protected", "public", "return", "short", "static",
    "strictfp", "super", "switch", "synchronized", "this", "throw", "throws",
    "transient", "try", "void", "volatile", "while", "yield",
    # Note: record, sealed, permits, non-sealed, var are CONTEXTUAL keywords —
    # only reserved in class declarations, valid as field/method/param names.
}


def safe_name(name: str) -> str:
    """Escape Java keywords used as identifiers."""
    # Some JVM names use $ or weird chars; also handle keywords
    if name in JAVA_KEYWORDS:
        return name + "_"
    return name


def class_modifiers(flags: int, is_inner: bool = False) -> str:
    parts = []
    if flags & ACC_PUBLIC:      parts.append("public")
    if is_inner:
        if flags & ACC_PRIVATE:   parts.append("private")
        if flags & ACC_PROTECTED: parts.append("protected")
        if flags & ACC_STATIC:    parts.append("static")
    if flags & ACC_ABSTRACT and not (flags & ACC_INTERFACE) and not (flags & ACC_ENUM):
        parts.append("abstract")
    if flags & ACC_FINAL and not (flags & ACC_ENUM):
        parts.append("final")
    if flags & ACC_STRICT:      parts.append("strictfp")
    return " ".join(parts)


def field_modifiers(flags: int) -> str:
    parts = []
    if flags & ACC_PUBLIC:       parts.append("public")
    if flags & ACC_PRIVATE:      parts.append("private")
    if flags & ACC_PROTECTED:    parts.append("protected")
    if flags & ACC_STATIC:       parts.append("static")
    if flags & ACC_FINAL:        parts.append("final")
    if flags & ACC_VOLATILE:     parts.append("volatile")
    if flags & ACC_TRANSIENT:    parts.append("transient")
    return " ".join(parts)


def method_modifiers(flags: int, is_interface: bool = False) -> str:
    parts = []
    if flags & ACC_PUBLIC:       parts.append("public")
    if flags & ACC_PRIVATE:      parts.append("private")
    if flags & ACC_PROTECTED:    parts.append("protected")
    if flags & ACC_STATIC:       parts.append("static")
    if flags & ACC_FINAL:        parts.append("final")
    if flags & ACC_SYNCHRONIZED: parts.append("synchronized")
    if flags & ACC_NATIVE:       parts.append("native")
    if flags & ACC_ABSTRACT and not is_interface:
        parts.append("abstract")
    if flags & ACC_STRICT:       parts.append("strictfp")
    return " ".join(parts)


def default_return(java_type: str) -> str:
    """Generate a default return statement for a stub method body."""
    t = java_type.strip()
    if t == "void":    return ""
    if t == "boolean": return "return false;"
    if t == "char":    return "return 0;"
    if t == "byte":    return "return 0;"
    if t == "short":   return "return 0;"
    if t == "int":     return "return 0;"
    if t == "long":    return "return 0L;"
    if t == "float":   return "return 0.0f;"
    if t == "double":  return "return 0.0;"
    return "return null;"


def format_constant(cv, descriptor: str = "") -> Optional[str]:
    """Format a ConstantValue attribute for source."""
    if cv is None:
        return None
    kind, val = cv
    if kind == "String":
        escaped = (val.replace("\\", "\\\\")
                      .replace("\"", "\\\"")
                      .replace("\n", "\\n")
                      .replace("\r", "\\r")
                      .replace("\t", "\\t"))
        return f'"{escaped}"'
    if kind == "int":
        # Boolean fields store 0/1 as int in ConstantValue
        if descriptor == "Z":
            return "true" if val else "false"
        # Char fields store char code as int
        if descriptor == "C":
            ch = chr(val)
            if ch == "'":
                return "'\\''"
            if ch == "\\":
                return "'\\\\'"
            if 32 <= val < 127:
                return f"'{ch}'"
            # Use hex escape instead of unicode escape (javac expands \uXXXX before parsing)
            return f"(char)0x{val:04x}"
        return str(val)
    if kind == "long":
        return f"{val}L"
    if kind == "float":
        import math
        if math.isnan(val):      return "Float.NaN"
        if math.isinf(val):
            return "Float.POSITIVE_INFINITY" if val > 0 else "Float.NEGATIVE_INFINITY"
        return f"{val}f"
    if kind == "double":
        import math
        if math.isnan(val):      return "Double.NaN"
        if math.isinf(val):
            return "Double.POSITIVE_INFINITY" if val > 0 else "Double.NEGATIVE_INFINITY"
        return str(val)
    return None


def format_annotation_value(av: AnnotationValue) -> Optional[str]:
    """Format an annotation element value for source code."""
    if av.tag == 's':
        escaped = (av.value.replace("\\", "\\\\")
                           .replace("\"", "\\\"")
                           .replace("\n", "\\n")
                           .replace("\r", "\\r")
                           .replace("\t", "\\t"))
        return f'"{escaped}"'
    if av.tag in ('B', 'S', 'I'):
        return str(av.value)
    if av.tag == 'J':
        return f"{av.value}L"
    if av.tag == 'F':
        import math
        if math.isnan(av.value): return "Float.NaN"
        if math.isinf(av.value):
            return "Float.POSITIVE_INFINITY" if av.value > 0 else "Float.NEGATIVE_INFINITY"
        return f"{av.value}f"
    if av.tag == 'D':
        import math
        if math.isnan(av.value): return "Double.NaN"
        if math.isinf(av.value):
            return "Double.POSITIVE_INFINITY" if av.value > 0 else "Double.NEGATIVE_INFINITY"
        return str(av.value)
    if av.tag == 'Z':
        return "true" if av.value else "false"
    if av.tag == 'C':
        ch = chr(av.value) if isinstance(av.value, int) else av.value
        if ch == "'":  return "'\\''"
        if ch == "\\": return "'\\\\'"
        if ch == "\n": return "'\\n'"
        if ch == "\r": return "'\\r'"
        if ch == "\t": return "'\\t'"
        if 32 <= ord(ch) < 127:
            return f"'{ch}'"
        return f"'\\u{ord(ch):04x}'"
    if av.tag == 'e':
        type_desc, const_name = av.value
        enum_type = descriptor_to_java(type_desc)
        return f"{enum_type}.{const_name}"
    if av.tag == 'c':
        class_desc = av.value
        if class_desc == "V" or class_desc == "void":
            return "void.class"
        jt = descriptor_to_java(class_desc)
        return f"{jt}.class"
    if av.tag == '@':
        ann: AnnotationInfo = av.value
        return format_annotation(ann)
    if av.tag == '[':
        items = [format_annotation_value(v) for v in av.value]
        items = [i for i in items if i is not None]
        if len(items) == 1:
            return items[0]
        return "{" + ", ".join(items) + "}"
    return None


def format_annotation(ann: AnnotationInfo) -> str:
    """Format @AnnotationType(key=val, ...) for source."""
    type_name = descriptor_to_java(ann.type_descriptor)
    if not ann.elements:
        return f"@{type_name}"
    pairs = []
    for k, v in ann.elements.items():
        fv = format_annotation_value(v)
        if fv is not None:
            pairs.append(f"{k}={fv}")
    if len(pairs) == 1 and pairs[0].startswith("value="):
        return f"@{type_name}({pairs[0][6:]})"
    return f"@{type_name}({', '.join(pairs)})"


# Annotations to skip in generated stubs (Kotlin metadata, internal, etc.)
SKIP_ANNOTATIONS = {
    "Lkotlin/Metadata;",
    "Ldalvik/annotation/MemberClasses;",
    "Ldalvik/annotation/InnerClass;",
    "Ldalvik/annotation/EnclosingClass;",
    "Ldalvik/annotation/EnclosingMethod;",
    "Ldalvik/annotation/Signature;",
    "Ldalvik/annotation/MethodParameters;",
}


SKIP_ANNOTATION_PACKAGES = (
    "sun.", "com.sun.",
    "android.compat.annotation.", "android.compat.",
    "dalvik.annotation.optimization.",
    "androidx.annotation.",
    "com.android.aconfig.annotations.",
    "com.android.internal.annotations.",
    "android.ravenwood.annotation.",
    "android.ravenwood.",
)


def should_emit_annotation(ann: AnnotationInfo) -> bool:
    if ann.type_descriptor in SKIP_ANNOTATIONS:
        return False
    td = descriptor_to_java(ann.type_descriptor)
    for prefix in SKIP_ANNOTATION_PACKAGES:
        if td.startswith(prefix):
            return False
    return True


# ── Stub source generator ────────────────────────────────────────────────────

class StubGenerator:
    """
    Given a dict of {internal_name -> ClassInfo}, generates Java stub sources.
    Handles inner classes by collecting them under their outer class.
    """

    def __init__(self, classes: Dict[str, ClassInfo],
                 fake_deps_classes: Optional[Set[str]] = None):
        self.classes = classes
        self.fake_deps_classes: Set[str] = fake_deps_classes or set()
        # Map outer_class_internal_name → [inner ClassInfo, ...]
        self.inner_map: Dict[str, List[Tuple[ClassInfo, InnerClassEntry]]] = defaultdict(list)
        # Set of classes that are inner (should not get their own file)
        self.inner_classes_set: Set[str] = set()
        self._build_inner_map()

    _JAVA_PRIMITIVES = frozenset({
        'void', 'boolean', 'byte', 'char', 'short', 'int', 'long', 'float', 'double'
    })

    def _type_resolvable(self, java_type: str) -> bool:
        """Check if a Java type is resolvable (exists in our class set or JDK)."""
        t = java_type.strip()
        if not t:
            return True
        # Primitives and void
        if t in self._JAVA_PRIMITIVES:
            return True
        # Array types: strip trailing []
        while t.endswith('[]'):
            t = t[:-2].strip()
        if t in self._JAVA_PRIMITIVES:
            return True
        # Wildcard: "? extends Foo" / "? super Foo" / "?"
        if t.startswith('?'):
            rest = t[1:].strip()
            if not rest:
                return True
            if rest.startswith('extends '):
                return self._type_resolvable(rest[8:])
            if rest.startswith('super '):
                return self._type_resolvable(rest[6:])
            return True
        # Strip generics: "com.foo.Bar<X, Y>" -> "com.foo.Bar"
        base = t.split('<')[0].strip()
        if not base:
            return True
        # Type variables (single letter or short names without dots — e.g., T, E, K, V)
        if '.' not in base and len(base) <= 3 and base[0].isupper():
            return True
        # JDK types and Android-bundled libraries are always available
        if base.startswith(('java.', 'javax.', 'org.xmlpull.')):
            return True
        # Convert dotted name to internal name and check
        iname = base.replace('.', '/')
        if iname in self.classes or iname in self.fake_deps_classes:
            return True
        # Try $ variants for inner classes (com.foo.Bar.Inner -> com/foo/Bar$Inner)
        parts = iname.split('/')
        for i in range(len(parts) - 1, 0, -1):
            candidate = '/'.join(parts[:i]) + '$' + '$'.join(parts[i:])
            if candidate in self.classes or candidate in self.fake_deps_classes:
                return True
        return False

    def _build_inner_map(self):
        """Build mapping from outer class to its direct inner classes."""
        for iname, ci in self.classes.items():
            for ice in ci.inner_classes:
                if (ice.outer_class and
                        ice.inner_class == iname and
                        ice.outer_class != iname and
                        ice.outer_class in self.classes):
                    self.inner_classes_set.add(iname)
                    self.inner_map[ice.outer_class].append((ci, ice))
        # Also mark $-containing classes whose outer is in the class set but
        # weren't caught above (e.g. missing InnerClasses attribute entries).
        for iname in list(self.classes.keys()):
            if '$' in iname and iname not in self.inner_classes_set:
                # Derive outer from the name: a/b/Outer$Inner → a/b/Outer
                outer_candidate = iname.rsplit('$', 1)[0]
                ci = self.classes[iname]
                simple = iname.rsplit('$', 1)[-1]
                # Skip anonymous classes (numeric names like Foo$1)
                if simple.isdigit():
                    self.inner_classes_set.add(iname)
                    continue
                if outer_candidate in self.classes:
                    # Outer exists — register as inner
                    flags = ci.access_flags
                    ice = InnerClassEntry(iname, outer_candidate, simple, flags)
                    self.inner_classes_set.add(iname)
                    self.inner_map[outer_candidate].append((ci, ice))
                else:
                    # Outer doesn't exist — create synthetic empty outer class
                    outer_simple = outer_candidate.rsplit('/', 1)[-1] if '/' in outer_candidate else outer_candidate
                    # Only if outer name doesn't contain $ (no nested orphans)
                    if '$' not in outer_simple:
                        synthetic = ClassInfo()
                        synthetic.this_class = outer_candidate
                        synthetic.super_class = 'java/lang/Object'
                        synthetic.access_flags = ACC_PUBLIC
                        synthetic.interfaces = []
                        synthetic.fields = []
                        synthetic.methods = []
                        synthetic.inner_classes = []
                        synthetic.annotations = []
                        synthetic.record_components = []
                        synthetic.permitted_subclasses = []
                        synthetic.is_record = False
                        synthetic.signature = None
                        self.classes[outer_candidate] = synthetic
                        # Register this inner class
                        flags = ci.access_flags | ACC_STATIC
                        ice = InnerClassEntry(iname, outer_candidate, simple, flags)
                        self.inner_classes_set.add(iname)
                        self.inner_map[outer_candidate].append((ci, ice))

    # JDK module packages — skip these during generation since they conflict
    # with JDK 17 modules and the JDK provides them at runtime anyway.
    _JDK_SKIP_PREFIXES = (
        'java/', 'javax/annotation/', 'javax/crypto/', 'javax/lang/',
        'javax/net/', 'javax/security/', 'javax/sql/', 'javax/xml/',
        'sun/', 'org/xml/sax/', 'org/xml/transform/', 'org/w3c/', 'jdk/',
    )

    def generate_all(self, output_dir: str):
        """Write all stub .java files to output_dir."""
        count = 0
        skipped = 0

        # Pre-scan for case collisions (Windows has case-insensitive filesystem)
        # Remove collision victims from self.classes BEFORE generating any stubs
        # so _type_resolvable returns false for them during generation.
        path_to_iname: Dict[str, str] = {}
        collision_victims: Set[str] = set()
        for iname in list(self.classes.keys()):
            if iname in self.inner_classes_set:
                continue
            simple = iname.rsplit('/', 1)[-1] if '/' in iname else iname
            if '$' in simple:
                continue
            rel_lower = (iname.replace('/', os.sep) + ".java").lower()
            if rel_lower in path_to_iname:
                prev = path_to_iname[rel_lower]
                # Keep the class with more inner classes (more useful)
                prev_inners = len(self.inner_map.get(prev, []))
                curr_inners = len(self.inner_map.get(iname, []))
                if curr_inners > prev_inners:
                    # Current class is better — evict previous
                    collision_victims.add(prev)
                    path_to_iname[rel_lower] = iname
                else:
                    collision_victims.add(iname)
            else:
                path_to_iname[rel_lower] = iname
        for cv in collision_victims:
            print(f"  WARN: Case collision: '{cv}', removing from class set",
                  file=sys.stderr)
            self.classes.pop(cv, None)

        written_paths_lower: Dict[str, str] = {}
        for iname, ci in list(self.classes.items()):
            # Skip inner classes (they are emitted by their outer)
            if iname in self.inner_classes_set:
                continue
            # Skip orphaned inner classes ($ in name but not in inner_classes_set)
            simple = iname.rsplit('/', 1)[-1] if '/' in iname else iname
            if '$' in simple:
                skipped += 1
                continue
            if simple == "module-info":
                skipped += 1
                continue
            # Skip synthetic classes
            if ci.access_flags & ACC_SYNTHETIC:
                skipped += 1
                continue
            # Skip JDK module packages (conflict with JDK 17)
            if any(iname.startswith(p) for p in self._JDK_SKIP_PREFIXES):
                skipped += 1
                continue

            try:
                source = self._generate_class_file(ci, iname)
                if source is None:
                    skipped += 1
                    continue
            except Exception as e:
                print(f"  WARN: Failed to generate stub for {iname}: {e}", file=sys.stderr)
                skipped += 1
                continue

            # Determine output path
            rel_path = iname.replace('/', os.sep) + ".java"

            out_path = os.path.join(output_dir, rel_path)
            os.makedirs(os.path.dirname(out_path), exist_ok=True)
            with open(out_path, "w", encoding="utf-8", newline="\n") as f:
                f.write(source)
            count += 1

        print(f"Generated {count} stub files, skipped {skipped}.")

    def _generate_class_file(self, ci: ClassInfo, iname: str) -> Optional[str]:
        """Generate the full .java source for a top-level class."""
        lines: List[str] = []

        # Package declaration
        if '/' in iname:
            pkg = iname.rsplit('/', 1)[0].replace('/', '.')
            lines.append(f"package {pkg};")
            lines.append("")

        simple = iname.rsplit('/', 1)[-1] if '/' in iname else iname

        # package-info
        if simple == "package-info":
            self._emit_annotations(ci.annotations, lines, "")
            return "\n".join(lines) + "\n"

        self._emit_class(ci, iname, lines, "", is_inner=False, inner_entry=None)
        return "\n".join(lines) + "\n"

    def _emit_class(self, ci: ClassInfo, iname: str, lines: List[str],
                    indent: str, is_inner: bool, inner_entry: Optional[InnerClassEntry]):
        flags = inner_entry.inner_access_flags if inner_entry else ci.access_flags
        is_interface = bool(flags & ACC_INTERFACE)
        is_annotation = bool(flags & ACC_ANNOTATION)
        is_enum = bool(flags & ACC_ENUM) or bool(ci.access_flags & ACC_ENUM)
        is_record = ci.is_record

        # Determine simple name
        if inner_entry and inner_entry.inner_name:
            simple = inner_entry.inner_name
        else:
            simple = iname.rsplit('/', 1)[-1] if '/' in iname else iname
            # Strip outer class prefix for inner classes
            if '$' in simple:
                simple = simple.rsplit('$', 1)[-1]

        # Skip anonymous classes (numeric names)
        if simple.isdigit():
            return

        # Annotations
        self._emit_annotations(ci.annotations, lines, indent)

        # Class declaration
        mods = class_modifiers(flags, is_inner)

        # If concrete class has unimplemented abstract methods, make it abstract
        if (not is_interface and not is_annotation and not is_enum
                and not (flags & ACC_ABSTRACT)
                and self._has_missing_abstract_methods(ci)):
            if 'abstract' not in mods:
                # Remove 'final' (incompatible with abstract)
                parts = [p for p in mods.split() if p != 'final']
                parts.append('abstract')
                mods = ' '.join(parts)

        # Parse generics
        type_params_str = ""
        super_type = None
        iface_types = []

        if ci.signature:
            parsed = parse_generic_class_sig(ci.signature)
            if parsed:
                type_params_str, super_type, iface_types = parsed

        if not super_type and ci.super_class:
            super_type = ci.super_class.replace('/', '.').replace('$', '.')
        if not iface_types:
            iface_types = [i.replace('/', '.').replace('$', '.') for i in ci.interfaces]

        decl = indent
        if mods:
            decl += mods + " "

        sealed_kw = "sealed " if ci.permitted_subclasses else ""
        if is_annotation:
            decl += f"@interface {simple}"
        elif is_enum:
            decl += f"enum {simple}"
        elif is_interface:
            decl += f"{sealed_kw}interface {simple}"
        elif is_record:
            decl += f"record {simple}"
        else:
            decl += f"{sealed_kw}class {simple}"

        if type_params_str:
            decl += type_params_str

        # Record components
        if is_record:
            comps = []
            for comp_name, comp_desc, comp_sig in ci.record_components:
                comp_type = parse_generic_field_sig(comp_sig) if comp_sig else descriptor_to_java(comp_desc)
                comps.append(f"{comp_type} {safe_name(comp_name)}")
            decl += "(" + ", ".join(comps) + ")"

        # Extends (strip if unresolvable to avoid cascade errors)
        if (not is_interface and not is_enum and not is_annotation and not is_record
                and super_type and super_type != "java.lang.Object"):
            if self._type_resolvable(super_type):
                decl += f" extends {super_type}"
            else:
                # Unresolvable parent → fall back to Object (no extends clause)
                ci.super_class = "java/lang/Object"

        # Implements / extends (interfaces) — filter out unresolvable types
        visible_ifaces = [i for i in iface_types
                          if i != "java.lang.annotation.Annotation"
                          and i != "java.lang.Record"
                          and self._type_resolvable(i)]
        if visible_ifaces:
            kw = "extends" if is_interface else "implements"
            decl += f" {kw} " + ", ".join(visible_ifaces)

        # Permitted subclasses
        if ci.permitted_subclasses:
            names = [c.replace('/', '.').rsplit('.', 1)[-1]
                     for c in ci.permitted_subclasses]
            decl += " permits " + ", ".join(names)

        decl += " {"
        lines.append(decl)

        inner_indent = indent + "    "

        # Enum constants
        if is_enum:
            self._emit_enum_constants(ci, lines, inner_indent)

        # Fields (non-enum-constant)
        for fi in ci.fields:
            if fi.access_flags & ACC_SYNTHETIC:
                continue
            if is_enum and (fi.access_flags & ACC_ENUM):
                continue  # already emitted as enum constant
            self._emit_field(fi, lines, inner_indent, is_interface)

        # If class has no constructors and parent needs args, generate one
        if (not is_interface and not is_annotation and not is_enum and not is_record
                and not any(m.name == "<init>" for m in ci.methods)):
            if ci.super_class and ci.super_class != "java/lang/Object":
                super_call, extra_throws = _build_super_call(ci.super_class, self.classes,
                                                              child_class=iname)
                if super_call != "super();":
                    # Parent has no no-arg ctor; generate explicit default ctor
                    simple_name = simple
                    throws_str = ""
                    if extra_throws:
                        throws_str = " throws " + ", ".join(extra_throws)
                    lines.append(f"{inner_indent}{simple_name}(){throws_str} {{ {super_call} }}")

        # Methods
        emitted_ctors: Set[str] = set()  # track ctor param signatures to avoid duplicates
        for mi in ci.methods:
            if mi.access_flags & ACC_SYNTHETIC and not (mi.access_flags & ACC_BRIDGE):
                continue
            if mi.name in ("<clinit>",):
                continue
            if is_enum and mi.name == "values" and mi.descriptor == ("()[L" + iname + ";"):
                continue  # auto-generated
            if is_enum and mi.name == "valueOf" and mi.descriptor == ("(Ljava/lang/String;)L" + iname + ";"):
                continue  # auto-generated
            self._emit_method(ci, mi, lines, inner_indent, is_interface, is_annotation,
                              is_enum, is_record, iname, emitted_ctors=emitted_ctors)

        # (abstract method check is done earlier, in the declaration)

        # Inner classes
        inner_list = self.inner_map.get(iname, [])
        for inner_ci, ice in inner_list:
            if inner_ci.access_flags & ACC_SYNTHETIC:
                continue
            # Skip anonymous/invalid inner classes (empty name, numeric name)
            sn = ice.inner_name
            if not sn or sn[0].isdigit():
                continue
            lines.append("")
            self._emit_class(inner_ci, inner_ci.this_class, lines, inner_indent,
                             is_inner=True, inner_entry=ice)

        lines.append(indent + "}")

    def _has_missing_abstract_methods(self, ci: ClassInfo) -> bool:
        """Check if a concrete class has unimplemented abstract methods from parents.
        Only checks parents/interfaces within our class set. If the class chain
        reaches a class outside our set (e.g. JDK), we assume it provides
        all necessary implementations — avoids false positives.
        Uses (name, param_descriptor) ignoring return type, with a fallback to
        (name, param_count) for type-erased generic methods (Object params)."""
        def _param_key(name: str, descriptor: str) -> Tuple[str, str]:
            close = descriptor.index(')')
            return (name, descriptor[:close + 1])

        def _count_key(name: str, descriptor: str) -> Tuple[str, int]:
            params, _ = parse_method_descriptor(descriptor)
            return (name, len(params))

        def _has_object_param(descriptor: str) -> bool:
            """Check if any param is java.lang.Object or java.lang.Object[]
            (type-erased generic, including varargs)."""
            params, _ = parse_method_descriptor(descriptor)
            return any(p.rstrip('[]') == 'java.lang.Object' for p in params)

        # Collect all concrete and abstract methods from the class and its
        # entire known super-class chain.
        concrete_param: Set[Tuple[str, str]] = set()   # (name, param_desc)
        concrete_count: Set[Tuple[str, int]] = set()   # (name, param_count)
        # Each abstract entry: (name, descriptor, from_generic)
        abstract_from_classes: List[Tuple[str, str, bool]] = []
        cls = ci
        while cls:
            is_generic = bool(cls.signature)
            for mi in cls.methods:
                if mi.name in ('<init>', '<clinit>'):
                    continue
                if mi.access_flags & ACC_ABSTRACT:
                    abstract_from_classes.append((mi.name, mi.descriptor, is_generic))
                else:
                    concrete_param.add(_param_key(mi.name, mi.descriptor))
                    concrete_count.add(_count_key(mi.name, mi.descriptor))
            sc = cls.super_class
            if not sc or sc == 'java/lang/Object':
                break
            if sc not in self.classes:
                return False
            cls = self.classes[sc]

        # Also collect abstract methods from interfaces (only those in our set)
        visited: Set[str] = set()
        abstract_from_ifaces: List[Tuple[str, str, bool]] = []

        def _collect_abstract_from_ifaces(class_iname: str):
            cls2 = self.classes.get(class_iname)
            if not cls2:
                return
            cur = cls2
            while cur:
                for ifc in cur.interfaces:
                    if ifc in visited or ifc not in self.classes:
                        continue
                    visited.add(ifc)
                    ifc_ci = self.classes[ifc]
                    ifc_generic = bool(ifc_ci.signature)
                    for mi in ifc_ci.methods:
                        if mi.name not in ('<init>', '<clinit>') and (mi.access_flags & ACC_ABSTRACT):
                            abstract_from_ifaces.append((mi.name, mi.descriptor, ifc_generic))
                    _collect_abstract_from_ifaces(ifc)
                sc = cur.super_class
                if not sc or sc == 'java/lang/Object' or sc not in self.classes:
                    break
                cur = self.classes[sc]

        _collect_abstract_from_ifaces(ci.this_class)

        # Check all abstract methods for missing concrete implementations
        for name, desc, from_generic in abstract_from_classes + abstract_from_ifaces:
            pk = _param_key(name, desc)
            if pk in concrete_param:
                continue  # exact param match (ignoring return type)
            # Fallback: use (name, param_count) matching for methods from
            # generic classes/interfaces — Android bytecode commonly lacks
            # bridge methods for generic specializations where type params
            # erase to bounds (Object, Adapter, etc.)
            if from_generic:
                ck = _count_key(name, desc)
                if ck in concrete_count:
                    continue
            return True
        return False

    def _emit_annotations(self, annotations: List[AnnotationInfo],
                          lines: List[str], indent: str):
        for ann in annotations:
            if not should_emit_annotation(ann):
                continue
            # Skip annotations whose type isn't in the known class set
            # (they'd cause "cannot find symbol" errors)
            ann_iname = ann.type_descriptor
            if ann_iname.startswith('L') and ann_iname.endswith(';'):
                ann_iname = ann_iname[1:-1]
            # Check the outermost class (for inner annotations like Foo$Bar)
            outer = ann_iname.split('$')[0]
            if outer not in self.classes and not outer.startswith(('java/', 'javax/', 'android/annotation/')):
                continue
            try:
                text = format_annotation(ann)
                lines.append(f"{indent}{text}")
            except Exception:
                pass  # skip malformed annotations

    def _emit_enum_constants(self, ci: ClassInfo, lines: List[str], indent: str):
        constants = []
        for fi in ci.fields:
            if fi.access_flags & ACC_ENUM and fi.access_flags & ACC_STATIC:
                constants.append(fi.name)

        # Check if enum has a constructor with extra parameters.
        # Use generic signature (same as _emit_method) to get the Java-visible params.
        # The raw descriptor includes synthetic (String, int) prefix that the generic
        # signature omits.
        args_str = ""

        def _enum_ctor_params(mi):
            """Get the Java-visible constructor params for an enum ctor,
            stripping the implicit (String, int) name/ordinal prefix.
            Mirrors _emit_method: check RAW descriptor for prefix, then strip
            that offset from whatever param source is used."""
            # Determine offset from raw descriptor
            raw_params, _ = parse_method_descriptor(mi.descriptor)
            offset = 0
            if len(raw_params) >= 2 and raw_params[0] == "java.lang.String" and raw_params[1] == "int":
                offset = 2
            # Get params from generic sig or raw descriptor
            if mi.signature:
                gen = parse_generic_method_sig(mi.signature)
                if gen:
                    return gen[1][offset:]
            return raw_params[offset:]

        for mi in ci.methods:
            if mi.name == "<init>" and not (mi.access_flags & ACC_SYNTHETIC):
                extra = _enum_ctor_params(mi)
                if not extra:
                    args_str = ""  # found a no-extra-arg ctor
                    break
        else:
            # No no-arg ctor found; pick the ctor with fewest extra params
            best_extra = None
            for mi in ci.methods:
                if mi.name == "<init>" and not (mi.access_flags & ACC_SYNTHETIC):
                    extra = _enum_ctor_params(mi)
                    if best_extra is None or len(extra) < len(best_extra):
                        best_extra = extra
            if best_extra:
                args = [_default_value_for_type(t) for t in best_extra]
                args_str = "(" + ", ".join(args) + ")"

        if constants:
            for i, name in enumerate(constants):
                suffix = "," if i < len(constants) - 1 else ";"
                lines.append(f"{indent}{name}{args_str}{suffix}")
        else:
            lines.append(f"{indent};")

    def _emit_field(self, fi: FieldInfo, lines: List[str], indent: str,
                    is_interface: bool):
        mods = field_modifiers(fi.access_flags)

        # Use generic signature if available
        if fi.signature:
            field_type = parse_generic_field_sig(fi.signature)
            if field_type is None:
                field_type = descriptor_to_java(fi.descriptor)
        else:
            field_type = descriptor_to_java(fi.descriptor)

        # Skip fields with unresolvable types (e.g. sun.misc.Cleaner removed in JDK 9)
        if not self._type_resolvable(field_type):
            return

        self._emit_annotations(fi.annotations, lines, indent)

        name = safe_name(fi.name)

        # Constant value for static final fields
        cv = format_constant(fi.constant_value, fi.descriptor)
        is_static_final = bool(fi.access_flags & ACC_STATIC) and bool(fi.access_flags & ACC_FINAL)
        if cv is not None and is_static_final:
            line = f"{indent}{mods} {field_type} {name} = {cv};".strip()
        else:
            # Provide default value for interface fields, static final, and instance final
            if is_interface or (fi.access_flags & ACC_FINAL) or is_static_final:
                # For static final primitives WITHOUT a ConstantValue attribute,
                # use a non-constant initializer to prevent javac inlining.
                if is_static_final and fi.descriptor[0] in 'ZBCSIJFD' and cv is None:
                    dv = _non_constant_field_value(fi.descriptor)
                else:
                    dv = _default_field_value(fi.descriptor)
                line = f"{indent}{mods} {field_type} {name} = {dv};".strip()
            else:
                line = f"{indent}{mods} {field_type} {name};".strip()

        lines.append(f"{indent}{line.strip()}")

    def _emit_method(self, ci: ClassInfo, mi: MethodInfo, lines: List[str],
                     indent: str, is_interface: bool, is_annotation: bool,
                     is_enum: bool, is_record: bool, class_iname: str,
                     emitted_ctors: Optional[Set[str]] = None):
        flags = mi.access_flags
        is_abstract = bool(flags & ACC_ABSTRACT)
        is_native = bool(flags & ACC_NATIVE)
        is_constructor = mi.name == "<init>"
        is_bridge = bool(flags & ACC_BRIDGE)
        is_static = bool(flags & ACC_STATIC)

        # Skip bridge methods that duplicate a real method
        if is_bridge:
            return

        mods = method_modifiers(flags, is_interface)

        # Parse signature for generics
        type_params_str = ""
        param_types: List[str] = []
        return_type = "void"
        throws: List[str] = []

        if mi.signature:
            parsed = parse_generic_method_sig(mi.signature)
            if parsed:
                type_params_str, param_types, return_type, throws = parsed
            else:
                param_types, return_type = parse_method_descriptor(mi.descriptor)
        else:
            param_types, return_type = parse_method_descriptor(mi.descriptor)

        if not throws and mi.exceptions:
            throws = [e.replace('/', '.').replace('$', '.') for e in mi.exceptions]

        self._emit_annotations(mi.annotations, lines, indent)

        # Determine method name
        if is_constructor:
            simple_class = class_iname.rsplit('/', 1)[-1] if '/' in class_iname else class_iname
            if '$' in simple_class:
                simple_class = simple_class.rsplit('$', 1)[-1]
            method_name = simple_class
        else:
            method_name = safe_name(mi.name)

        # For annotation methods → annotation element
        if is_annotation and not is_constructor and not is_static:
            ret = return_type
            line = f"{indent}{'public ' if not (flags & ACC_PUBLIC) else ''}{mods} {ret} {method_name}()"
            if mi.annotation_default is not None:
                dv = format_annotation_value(mi.annotation_default)
                if dv:
                    line += f" default {dv}"
            line += ";"
            lines.append(line)
            return

        # Enum constructors: skip implicit (String, int) params
        offset = 0
        if is_enum and is_constructor:
            raw_params, _ = parse_method_descriptor(mi.descriptor)
            # Enum constructors have synthetic (String, int) prepended
            if len(raw_params) >= 2 and raw_params[0] == "java.lang.String" and raw_params[1] == "int":
                offset = 2
                param_types = param_types[2:]

        # Deduplicate constructors (same params after stripping)
        if is_constructor and emitted_ctors is not None:
            ctor_key = ",".join(param_types)
            if ctor_key in emitted_ctors:
                return
            emitted_ctors.add(ctor_key)

        # Build param list — use record component names for record constructors
        param_names = [_param_name(i) for i in range(len(param_types))]
        if is_record and is_constructor and ci.record_components:
            # Check if this is the canonical constructor (params match components)
            comp_descs = [cd for _, cd, _ in ci.record_components]
            raw_params_desc, _ = parse_method_descriptor(mi.descriptor)
            comp_java = [descriptor_to_java(d) for d in comp_descs]
            if raw_params_desc == comp_java:
                # Canonical constructor: use component names
                param_names = [safe_name(cn) for cn, _, _ in ci.record_components]
        params_str = ", ".join(
            f"{pt} {param_names[i]}" for i, pt in enumerate(param_types)
        )

        # Varargs: replace last param's [] with ...
        if (flags & ACC_VARARGS) and param_types:
            last = param_types[-1]
            if last.endswith("[]"):
                base = last[:-2]
                params_str = ", ".join(
                    f"{pt} {_param_name(i)}" for i, pt in enumerate(param_types[:-1])
                )
                if params_str:
                    params_str += ", "
                params_str += f"{base}... {_param_name(len(param_types) - 1)}"

        # Build declaration
        parts = []
        if mods:
            parts.append(mods)
        if type_params_str:
            parts.append(type_params_str)
        if not is_constructor:
            parts.append(return_type)
        parts.append(f"{method_name}({params_str})")

        decl = " ".join(parts)

        if throws:
            decl += " throws " + ", ".join(throws)

        # Body
        if (is_abstract or is_native) and not is_enum:
            lines.append(f"{indent}{decl};")
        elif is_enum and is_abstract:
            # Enum with abstract methods: emit concrete body (enum constants can't have
            # anonymous class implementations in stubs)
            concrete_decl = decl.replace("abstract ", "")
            ret_stmt = default_return(return_type)
            if ret_stmt:
                lines.append(f"{indent}{concrete_decl} {{ {ret_stmt} }}")
            else:
                lines.append(f"{indent}{concrete_decl} {{}}")
        elif is_native:
            lines.append(f"{indent}{decl};")
        elif is_interface and not is_static and not (flags & ACC_ABSTRACT):
            # Default method
            ret_stmt = default_return(return_type)
            if ret_stmt:
                lines.append(f"{indent}default {decl} {{ {ret_stmt} }}")
            else:
                lines.append(f"{indent}default {decl} {{}}")
        else:
            # Concrete method / static method / constructor
            if is_record and is_constructor:
                # Check if canonical (params match record components)
                is_canonical = False
                if ci.record_components:
                    comp_java = [descriptor_to_java(cd) for _, cd, _ in ci.record_components]
                    raw_p, _ = parse_method_descriptor(mi.descriptor)
                    is_canonical = (raw_p == comp_java)
                if is_canonical:
                    # Canonical constructor: must assign all components
                    assigns = " ".join(
                        f"this.{safe_name(cn)} = {safe_name(cn)};"
                        for cn, _, _ in ci.record_components)
                    lines.append(f"{indent}{decl} {{ {assigns} }}")
                else:
                    # Non-canonical: must delegate to this(...) with defaults
                    if ci.record_components:
                        comp_java = [descriptor_to_java(cd) for _, cd, _ in ci.record_components]
                        args = [_default_value_for_type(t) for t in comp_java]
                        lines.append(f"{indent}{decl} {{ this({', '.join(args)}); }}")
                    else:
                        lines.append(f"{indent}{decl} {{}}")
            else:
                body, extra_throws = _make_body(is_constructor, return_type, ci.super_class, is_enum,
                                  self.classes, mi.descriptor if is_constructor else None,
                                  class_iname if is_constructor else None)
                if extra_throws:
                    # Parent ctor throws checked exceptions not in child's throws clause
                    merged = list(throws)
                    for et in extra_throws:
                        if et not in merged:
                            merged.append(et)
                    if len(merged) != len(throws):
                        # Rebuild decl with updated throws
                        decl = " ".join(parts)
                        if merged:
                            decl += " throws " + ", ".join(merged)
                lines.append(f"{indent}{decl} {body}")


def _param_name(idx: int) -> str:
    return f"p{idx}"


def _default_field_value(descriptor: str) -> str:
    """Default initializer value for a field based on its descriptor."""
    c = descriptor[0]
    if c in ('B', 'C', 'S', 'I'): return "0"
    if c == 'J': return "0L"
    if c == 'F': return "0.0f"
    if c == 'D': return "0.0"
    if c == 'Z': return "false"
    return "null"


def _non_constant_field_value(descriptor: str) -> str:
    """Non-constant initializer for static final primitive fields that lack a
    ConstantValue attribute.  Using a method call prevents javac from treating
    the field as a compile-time constant (JLS 15.29) and inlining the value
    into call sites.  Fields like Build.VERSION.SDK_INT must NOT be inlined."""
    c = descriptor[0]
    if c == 'Z': return "Boolean.valueOf(false)"
    if c == 'B': return "Byte.valueOf((byte)0)"
    if c == 'C': return "Character.valueOf((char)0)"
    if c == 'S': return "Short.valueOf((short)0)"
    if c == 'I': return "Integer.valueOf(0)"
    if c == 'J': return "Long.valueOf(0L)"
    if c == 'F': return "Float.valueOf(0.0f)"
    if c == 'D': return "Double.valueOf(0.0)"
    return "null"


def _make_body(is_constructor: bool, return_type: str,
               super_class: Optional[str], is_enum: bool,
               all_classes: Optional[Dict[str, ClassInfo]] = None,
               ctor_descriptor: Optional[str] = None,
               child_class: Optional[str] = None) -> Tuple[str, List[str]]:
    """Generate stub method body. Returns (body_string, extra_throws)."""
    if is_constructor:
        # Enums: no super() call needed (compiler adds it)
        if is_enum:
            return ("{}", [])
        # If extends something other than Object, generate super(...) call
        if super_class and super_class != "java/lang/Object":
            super_call, extra_throws = _build_super_call(super_class, all_classes, ctor_descriptor, child_class)
            return ("{ " + super_call + " }", extra_throws)
        return ("{}", [])
    ret = default_return(return_type)
    if ret:
        return ("{ " + ret + " }", [])
    return ("{}", [])


# Common JDK parent classes that lack no-arg constructors.
# Maps internal name -> list of constructor param-type lists (Java source types).
_JDK_PARENT_CTORS: Dict[str, List[List[str]]] = {
    # ── java.io ──
    "java/io/PrintWriter":         [["java.io.Writer"], ["java.io.OutputStream"]],
    "java/io/PrintStream":         [["java.io.OutputStream"]],
    "java/io/FilterWriter":        [["java.io.Writer"]],
    "java/io/FilterReader":        [["java.io.Reader"]],
    "java/io/FileInputStream":     [["java.io.FileDescriptor"]],
    "java/io/FileOutputStream":    [["java.io.FileDescriptor"]],
    "java/io/FilterInputStream":   [["java.io.InputStream"]],
    "java/io/FilterOutputStream":  [["java.io.OutputStream"]],
    "java/io/PipedInputStream":    [[]],
    "java/io/PipedOutputStream":   [[]],
    "java/io/InputStreamReader":   [["java.io.InputStream"]],
    "java/io/OutputStreamWriter":  [["java.io.OutputStream"]],
    "java/io/BufferedReader":      [["java.io.Reader"]],
    "java/io/BufferedWriter":      [["java.io.Writer"]],
    "java/io/BufferedInputStream": [["java.io.InputStream"]],
    "java/io/BufferedOutputStream":[["java.io.OutputStream"]],
    "java/io/ByteArrayInputStream":[["byte[]"]],
    # ── java.lang ──
    "java/lang/ref/WeakReference": [["java.lang.Object"]],
    "java/lang/ref/SoftReference": [["java.lang.Object"]],
    "java/lang/ref/PhantomReference": [["java.lang.Object", "java.lang.ref.ReferenceQueue"]],
    "java/lang/ClassLoader":       [["java.lang.ClassLoader"]],
    # ── java.net ──
    "java/net/Socket":             [[]],
    "java/net/ServerSocket":       [[]],
    "java/net/URLConnection":      [["java.net.URL"]],
    # ── java.security ──
    "java/security/Permission":       [["java.lang.String"]],
    "java/security/BasicPermission":  [["java.lang.String"]],
    "java/security/Provider":         [["java.lang.String", "java.lang.String", "java.lang.String"]],
    "java/security/KeyPairGeneratorSpi": [[]],
    "java/security/KeyPairGenerator": [["java.lang.String"]],
    "java/security/MessageDigest":    [["java.lang.String"]],
    "java/security/MessageDigestSpi": [[]],
    "java/security/SignatureSpi":     [[]],
    "java/security/AlgorithmParametersSpi": [[]],
    "java/security/cert/CertPath":    [["java.lang.String"]],
    "java/security/cert/CertStoreSpi":[["java.security.cert.CertStoreParameters"]],
    "java/security/cert/PKIXParameters": [["java.util.Set"]],
    "java/security/spec/EncodedKeySpec": [["byte[]"]],
    "java/security/spec/ECParameterSpec": [["java.security.spec.EllipticCurve", "java.security.spec.ECPoint", "java.math.BigInteger", "int"]],
    # ── javax.crypto / javax.net ──
    "javax/crypto/spec/DHParameterSpec":  [["java.math.BigInteger", "java.math.BigInteger"]],
    "javax/crypto/spec/DHPrivateKeySpec": [["java.math.BigInteger", "java.math.BigInteger", "java.math.BigInteger"]],
    "javax/crypto/spec/DHPublicKeySpec":  [["java.math.BigInteger", "java.math.BigInteger", "java.math.BigInteger"]],
    "javax/crypto/spec/IvParameterSpec":  [["byte[]"]],
    "javax/crypto/spec/PBEKeySpec":       [["char[]"]],
    "javax/net/ssl/SSLSocket":            [[]],
    # ── java.util.zip ──
    "java/util/zip/InflaterInputStream":  [["java.io.InputStream"]],
    "java/util/zip/DeflaterOutputStream": [["java.io.OutputStream"]],
    "java/util/zip/GZIPInputStream":      [["java.io.InputStream"]],
    "java/util/zip/GZIPOutputStream":     [["java.io.OutputStream"]],
    # ── java.util.concurrent ──
    "java/util/concurrent/FutureTask":         [["java.util.concurrent.Callable"]],
    "java/util/concurrent/CountedCompleter":   [[]],
    "java/util/concurrent/RecursiveTask":      [[]],
    "java/util/concurrent/RecursiveAction":    [[]],
    # ── javax.xml / org.xml ──
    "javax/xml/parsers/SAXParser":        [[]],
    "javax/xml/parsers/DocumentBuilder":  [[]],
    "org/xml/sax/SAXException":           [["java.lang.String"]],
    "org/xml/sax/SAXParseException":      [["java.lang.String", "java.lang.String", "java.lang.String", "int", "int"]],
}


def _build_super_call(super_class: str, all_classes: Optional[Dict[str, ClassInfo]],
                      ctor_descriptor: Optional[str] = None,
                      child_class: Optional[str] = None) -> Tuple[str, List[str]]:
    """Find the simplest accessible parent constructor and generate a super(...) call.
    Returns (super_call_string, extra_throws) where extra_throws are checked exceptions
    from the parent constructor that may need to be added to the child's throws clause.
    If child_class is provided and is an inner class of super_class, private constructors
    are also considered (inner classes can access private members of their enclosing class)."""
    if not all_classes or super_class not in all_classes:
        # Check JDK parent constructor table FIRST (curated, avoids checked exceptions)
        if super_class in _JDK_PARENT_CTORS:
            ctors = _JDK_PARENT_CTORS[super_class]
            for params in ctors:
                if len(params) == 0:
                    return ("super();", [])
            params = sorted(ctors, key=len)[0]
            args = [_default_value_for_type(p) for p in params]
            return ("super(" + ", ".join(args) + ");", [])
        # Fallback: CP-scanned constructor info for external classes
        if super_class in _external_constructors:
            ctors = _external_constructors[super_class]
            for params in ctors:
                if len(params) == 0:
                    return ("super();", [])
            ctors_sorted = sorted(ctors, key=len)
            params = ctors_sorted[0]
            args = [_default_value_for_type(p) for p in params]
            return ("super(" + ", ".join(args) + ");", [])
        return ("super();", [])
    parent = all_classes[super_class]
    def _ctor_params_and_method(m):
        """Get constructor param types, preferring generic signature but falling back
        to raw descriptor if signature produces bare type variables. Returns (params, method)."""
        if m.signature:
            gen = parse_generic_method_sig(m.signature)
            if gen:
                sig_params = gen[1]
                # Check for bare type variables (single uppercase letter or no '.' and no '[]')
                has_typevar = any(
                    len(p) <= 2 and p[0].isupper() and '.' not in p
                    for p in sig_params)
                if not has_typevar:
                    return sig_params
        return parse_method_descriptor(m.descriptor)[0]

    # Collect public/protected constructors (accessible from subclasses in any package)
    # Use generic signature when available (matches how _emit_method generates ctor decls,
    # and avoids including synthetic outer-class params from bytecode descriptors)
    ctor_entries = []  # list of (params, MethodInfo)
    for m in parent.methods:
        if m.name == "<init>" and not (m.access_flags & ACC_SYNTHETIC):
            if m.access_flags & (ACC_PUBLIC | ACC_PROTECTED):
                ctor_entries.append((_ctor_params_and_method(m), m))
    if not ctor_entries:
        # Fallback: try all non-private constructors (same-package subclasses)
        for m in parent.methods:
            if m.name == "<init>" and not (m.access_flags & (ACC_SYNTHETIC | ACC_PRIVATE)):
                ctor_entries.append((_ctor_params_and_method(m), m))
    if not ctor_entries:
        # Inner classes can access private ctors of their enclosing class,
        # and sibling inner classes share the same enclosing scope.
        def _shares_outer(a: str, b: str) -> bool:
            """Check if a and b are in the same enclosing class (siblings or nested)."""
            if not a or not b:
                return False
            if a.startswith(b + '$') or b.startswith(a + '$'):
                return True
            # Check if they share the same top-level outer class
            outer_a = a.split('$')[0]
            outer_b = b.split('$')[0]
            return outer_a == outer_b
        is_inner = child_class and _shares_outer(child_class, super_class)
        if is_inner:
            for m in parent.methods:
                if m.name == "<init>" and not (m.access_flags & ACC_SYNTHETIC):
                    ctor_entries.append((_ctor_params_and_method(m), m))
    if not ctor_entries:
        return ("super();", [])
    # Prefer no-arg constructor
    for params, mi in ctor_entries:
        if len(params) == 0:
            extra = [e.replace('/', '.').replace('$', '.') for e in (mi.exceptions or [])]
            return ("super();", extra)
    # Pick the constructor with fewest params
    ctor_entries.sort(key=lambda e: len(e[0]))
    params, chosen_mi = ctor_entries[0]
    # Count constructors visible to the caller for ambiguity detection.
    # If we ended up using private ctors (inner class access), count all non-synthetic.
    has_private = any(m.access_flags & ACC_PRIVATE for _, m in ctor_entries)
    if has_private:
        all_ctor_count = sum(1 for m in parent.methods
                             if m.name == "<init>"
                             and not (m.access_flags & ACC_SYNTHETIC))
    else:
        all_ctor_count = sum(1 for m in parent.methods
                             if m.name == "<init>"
                             and not (m.access_flags & (ACC_SYNTHETIC | ACC_PRIVATE)))
    need_cast = all_ctor_count > 1
    args = [_default_value_for_type(p, cast_refs=need_cast) for p in params]
    extra = [e.replace('/', '.').replace('$', '.') for e in (chosen_mi.exceptions or [])]
    return ("super(" + ", ".join(args) + ");", extra)


def _default_value_for_type(java_type: str, cast_refs: bool = True) -> str:
    """Return a default literal for a Java type (for use in super() args).
    When cast_refs is True, reference types get a typed null cast to avoid
    ambiguous overload resolution. When False, plain null is used."""
    t = java_type.strip()
    if t == "boolean": return "false"
    if t == "char":    return "(char)0"
    if t == "byte":    return "(byte)0"
    if t == "short":   return "(short)0"
    if t == "int":     return "0"
    if t == "long":    return "0L"
    if t == "float":   return "0.0f"
    if t == "double":  return "0.0"
    if cast_refs and t != "java.lang.Object":
        # Strip generic type args from casts — raw type suffices for disambiguation
        # and generic args can contain unresolvable type variables (T, V, etc.)
        raw = t.split('<')[0] if '<' in t else t
        return f"({raw})null"
    return "null"


# ── Fake dependency generator ────────────────────────────────────────────────

@dataclass
class ExternalMemberRef:
    """A method or field reference on an external class."""
    name: str
    descriptor: str
    is_method: bool
    is_interface_ref: bool  # True if from InterfaceMethodref (tag 11)


@dataclass
class ExternalClassRef:
    """Collected info about a class not present in the JAR."""
    internal_name: str
    used_as_interface: bool = False
    used_as_annotation: bool = False
    used_as_super: bool = False
    used_as_exception: bool = False
    type_param_count: int = 0  # max type args seen in generic signatures
    members: List[ExternalMemberRef] = field(default_factory=list)
    annotation_elements: Dict[str, str] = field(default_factory=dict)
    known_sub_classes: Set[str] = field(default_factory=set)

    @property
    def kind(self) -> str:
        """Determine what Java kind this class most likely is."""
        if self.used_as_annotation:
            return "annotation"
        if self.used_as_interface:
            return "interface"
        if self.used_as_exception:
            return "exception"
        # Heuristic: names ending with common interface patterns
        simple = self.internal_name.rsplit('/', 1)[-1]
        if simple.startswith('I') and len(simple) > 1 and simple[1].isupper():
            # e.g. IContentProvider — likely interface
            return "interface"
        return "class"


def _scan_cp_external_refs(data: bytes, known: Set[str]) \
        -> List[Tuple[str, Optional[str], Optional[str], bool, bool]]:
    """Lightweight constant-pool scan for external class/method/field refs.

    Returns list of tuples:
        (class_iname, member_name_or_None, member_desc_or_None, is_method, is_interface_ref)
    """
    try:
        pos = 8  # skip magic + version
        cp_count = struct.unpack_from('>H', data, pos)[0]; pos += 2

        cp: Dict[int, tuple] = {}
        i = 1
        while i < cp_count:
            tag = data[pos]; pos += 1
            if tag == 1:  # UTF8
                ln = struct.unpack_from('>H', data, pos)[0]; pos += 2
                cp[i] = (1, data[pos:pos + ln].decode('utf-8', 'replace'))
                pos += ln
            elif tag == 7:  # Class
                idx = struct.unpack_from('>H', data, pos)[0]; pos += 2
                cp[i] = (7, idx)
            elif tag in (9, 10, 11):  # Fieldref / Methodref / InterfaceMethodref
                ci_idx, nti = struct.unpack_from('>HH', data, pos); pos += 4
                cp[i] = (tag, ci_idx, nti)
            elif tag == 12:  # NameAndType
                ni, di = struct.unpack_from('>HH', data, pos); pos += 4
                cp[i] = (12, ni, di)
            elif tag in (3, 4):
                pos += 4; cp[i] = (tag,)
            elif tag in (5, 6):
                pos += 8; cp[i] = (tag,); i += 1; cp[i] = (0,)
            elif tag == 8:
                pos += 2; cp[i] = (tag,)
            elif tag == 15:
                pos += 3; cp[i] = (tag,)
            elif tag in (16, 19, 20):
                pos += 2; cp[i] = (tag,)
            elif tag in (17, 18):
                pos += 4; cp[i] = (tag,)
            else:
                cp[i] = (tag,)
            i += 1

        def _resolve_class(idx):
            e = cp.get(idx)
            if e and e[0] == 7:
                u = cp.get(e[1])
                if u and u[0] == 1:
                    return u[1]
            return None

        def _resolve_nat(idx):
            e = cp.get(idx)
            if e and e[0] == 12:
                ne = cp.get(e[1])
                de = cp.get(e[2])
                if ne and ne[0] == 1 and de and de[0] == 1:
                    return (ne[1], de[1])
            return None

        results = []
        for idx, entry in cp.items():
            if entry[0] in (9, 10, 11):
                cname = _resolve_class(entry[1])
                nat = _resolve_nat(entry[2])
                if cname and nat and cname not in known and not cname.startswith('['):
                    is_method = entry[0] in (10, 11)
                    is_iface = entry[0] == 11
                    results.append((cname, nat[0], nat[1], is_method, is_iface))
            elif entry[0] == 7:
                cname = _resolve_class(idx)
                if cname and cname not in known and not cname.startswith('['):
                    results.append((cname, None, None, False, False))
        return results
    except Exception:
        return []


def _classes_in_descriptor(desc: str) -> List[str]:
    """Extract all class internal names referenced in a JVM descriptor or signature string."""
    result = []
    i = 0
    while i < len(desc):
        ch = desc[i]
        if ch == 'L':
            # Scan class name: ends at '<', ';', or '.' (inner class sep in sigs)
            j = i + 1
            while j < len(desc) and desc[j] not in ('<', ';', '.'):
                j += 1
            cname = desc[i + 1:j]
            if cname and '/' in cname and ':' not in cname:
                result.append(cname)
            # Continue scanning from j (handles generic params and inner classes)
            i = j
        else:
            i += 1
    return result


def collect_external_refs(classes: Dict[str, ClassInfo], jar_path: str) \
        -> Dict[str, ExternalClassRef]:
    """Scan all classes + constant pools to find references to classes not in the JAR."""
    known = set(classes.keys())
    ext: Dict[str, ExternalClassRef] = {}

    def _get(iname: str) -> ExternalClassRef:
        if iname not in ext:
            ext[iname] = ExternalClassRef(internal_name=iname)
        return ext[iname]

    # ── Phase 1: from parsed ClassInfo ──
    for iname, ci in classes.items():
        if ci.super_class and ci.super_class not in known:
            ref = _get(ci.super_class)
            ref.used_as_super = True
            ref.known_sub_classes.add(iname)
        for ifc in ci.interfaces:
            if ifc not in known:
                _get(ifc).used_as_interface = True
        for mi in ci.methods:
            for exc in (mi.exceptions or []):
                if exc not in known:
                    _get(exc).used_as_exception = True
        # annotations
        all_anns: List[AnnotationInfo] = list(ci.annotations)
        for fi in ci.fields:
            all_anns.extend(fi.annotations)
        for mi in ci.methods:
            all_anns.extend(mi.annotations)
        for ann in all_anns:
            td = ann.type_descriptor
            if td.startswith('L') and td.endswith(';'):
                a = td[1:-1]
                if a not in known:
                    ref = _get(a)
                    ref.used_as_annotation = True
                    for elem_name, av in ann.elements.items():
                        ref.annotation_elements[elem_name] = av.tag

    # ── Phase 1b: scan field/method descriptors and signatures for type refs ──
    import re as _re
    _type_arg_pattern = _re.compile(r'L([^;<]+)<')

    def _scan_type_args(sig: str):
        """Detect external classes used with type arguments in a signature."""
        for m in _type_arg_pattern.finditer(sig):
            cname = m.group(1)
            if cname not in known and cname in ext:
                # Count top-level type args between < and matching >
                start = m.end()
                depth = 1
                argc = 1
                for ch in sig[start:]:
                    if ch == '<':
                        depth += 1
                    elif ch == '>':
                        depth -= 1
                        if depth == 0:
                            break
                    elif ch == ';' and depth == 1:
                        # each ; at depth 1 ends a type arg
                        pass
                    elif ch == 'L' and depth == 1:
                        # new type arg starts
                        pass
                # Count top-level type args by tracking type boundaries
                depth = 1
                argc = 0
                i = start
                while i < len(sig) and depth > 0:
                    ch = sig[i]
                    if ch == '<':
                        depth += 1
                        i += 1
                    elif ch == '>':
                        depth -= 1
                        i += 1
                    elif depth == 1 and ch == 'L':
                        argc += 1
                        # Skip to matching ';' (end of class reference)
                        while i < len(sig) and sig[i] != ';':
                            if sig[i] == '<':
                                depth += 1
                            elif sig[i] == '>':
                                depth -= 1
                            i += 1
                        i += 1  # skip the ';'
                    elif depth == 1 and ch == 'T':
                        argc += 1
                        # Skip to ';' (type variable reference)
                        while i < len(sig) and sig[i] != ';':
                            i += 1
                        i += 1
                    elif depth == 1 and ch in ('[', 'I', 'J', 'F', 'D', 'Z', 'B', 'S', 'C'):
                        if ch == '[':
                            i += 1  # skip array prefix, next char is the element type
                        else:
                            argc += 1
                            i += 1
                    else:
                        i += 1
                if argc > 0:
                    ref = ext[cname]
                    ref.type_param_count = max(ref.type_param_count, argc)

    for iname, ci in classes.items():
        # Class-level signature
        if ci.signature:
            for c in _classes_in_descriptor(ci.signature):
                if c not in known:
                    _get(c)
            _scan_type_args(ci.signature)
        for fi in ci.fields:
            for c in _classes_in_descriptor(fi.descriptor):
                if c not in known:
                    _get(c)
            if fi.signature:
                for c in _classes_in_descriptor(fi.signature):
                    if c not in known:
                        _get(c)
                _scan_type_args(fi.signature)
        for mi in ci.methods:
            for c in _classes_in_descriptor(mi.descriptor):
                if c not in known:
                    _get(c)
            if mi.signature:
                for c in _classes_in_descriptor(mi.signature):
                    if c not in known:
                        _get(c)
                _scan_type_args(mi.signature)

    # ── Phase 2: constant-pool scan for method/field refs ──
    print("Scanning constant pools for external references...")
    with zipfile.ZipFile(jar_path, 'r') as zf:
        for entry_name in zf.namelist():
            if not entry_name.endswith('.class'):
                continue
            raw = zf.read(entry_name)
            for cname, mname, mdesc, is_method, is_iface in _scan_cp_external_refs(raw, known):
                ref = _get(cname)
                if is_iface:
                    ref.used_as_interface = True
                if mname is not None:
                    ref.members.append(ExternalMemberRef(
                        name=mname, descriptor=mdesc,
                        is_method=is_method, is_interface_ref=is_iface))

    # Deduplicate members
    for ref in ext.values():
        seen: Set[Tuple[str, str, bool]] = set()
        unique = []
        for m in ref.members:
            key = (m.name, m.descriptor, m.is_method)
            if key not in seen:
                seen.add(key)
                unique.append(m)
        ref.members = unique

    # ── Phase 3: collect transitive type refs from fake member descriptors ──
    additional: Set[str] = set()
    for ref in ext.values():
        for m in ref.members:
            for c in _classes_in_descriptor(m.descriptor):
                if c not in known and c not in ext:
                    additional.add(c)
    for c in additional:
        _get(c)  # creates entry with defaults

    print(f"Found {len(ext)} external class references.")
    return ext


# Global store for CP-scanned external constructors (used by _build_super_call)
_external_constructors: Dict[str, List[List[str]]] = {}


def _populate_external_constructors(ext_refs: Dict[str, ExternalClassRef]):
    """Build a map of external_class_iname → list of constructor param-type lists.
    This lets _build_super_call generate correct super() calls for JDK parents."""
    global _external_constructors
    _external_constructors.clear()
    for iname, ref in ext_refs.items():
        ctors = []
        for m in ref.members:
            if m.is_method and m.name == "<init>":
                params, _ = parse_method_descriptor(m.descriptor)
                ctors.append(params)
        if ctors:
            _external_constructors[iname] = ctors


class FakeDepsGenerator:
    """Generates minimal fake Java stub files for external dependencies."""

    def __init__(self, ext_refs: Dict[str, ExternalClassRef],
                 known_classes: Set[str]):
        self.ext_refs = ext_refs
        self.known = known_classes
        # Classes that are JDK / standard — we still generate fakes for them
        # if they're referenced, since --fake-deps means fully standalone.

    def generate_all(self, output_dir: str):
        count = 0
        skipped = 0
        written_lower: Dict[str, str] = {}

        for iname, ref in self.ext_refs.items():
            # Skip array types, primitives
            if iname.startswith('[') or len(iname) == 1:
                skipped += 1
                continue
            # Skip inner classes — they'll be nested in outer
            if '$' in iname:
                skipped += 1
                continue
            # Skip JDK classes and JDK module packages — javac uses real JDK
            if (iname.startswith('java/') or iname.startswith('javax/')
                    or iname.startswith('sun/') or iname.startswith('org/xml/')
                    or iname.startswith('org/w3c/') or iname.startswith('jdk/')):
                skipped += 1
                continue

            try:
                source = self._generate_fake(ref)
            except Exception as e:
                print(f"  WARN: Failed to generate fake for {iname}: {e}",
                      file=sys.stderr)
                skipped += 1
                continue

            rel_path = iname.replace('/', os.sep) + ".java"
            rel_lower = rel_path.lower()
            if rel_lower in written_lower:
                skipped += 1
                continue
            written_lower[rel_lower] = iname

            out_path = os.path.join(output_dir, rel_path)
            # Don't overwrite real stubs
            if os.path.exists(out_path):
                skipped += 1
                continue

            os.makedirs(os.path.dirname(out_path), exist_ok=True)
            with open(out_path, "w", encoding="utf-8", newline="\n") as f:
                f.write(source)
            count += 1

        print(f"Generated {count} fake dependency stubs, skipped {skipped}.")

    def _generate_fake(self, ref: ExternalClassRef) -> str:
        iname = ref.internal_name
        lines: List[str] = []

        # Package
        if '/' in iname:
            pkg = iname.rsplit('/', 1)[0].replace('/', '.')
            lines.append(f"package {pkg};")
            lines.append("")

        simple = iname.rsplit('/', 1)[-1] if '/' in iname else iname
        kind = ref.kind

        # Also generate inner class fakes for $-containing refs that are nested under this outer
        # Uses prefix matching to catch inner-of-inner (e.g. Outer$Inner$Nested)
        prefix = iname + '$'
        inner_refs = [r for r in self.ext_refs.values()
                      if r.internal_name.startswith(prefix)
                      and '$' not in r.internal_name[len(prefix):]]  # direct children only

        if kind == "annotation":
            self._emit_annotation(ref, simple, lines, "")
        elif kind == "interface":
            self._emit_interface(ref, simple, lines, "")
        elif kind == "exception":
            self._emit_exception(ref, simple, lines, "")
        else:
            self._emit_class(ref, simple, lines, "")

        # Insert inner classes inside the outer class body (before closing })
        self._insert_inner_refs(iname, inner_refs, lines, "    ")

        return "\n".join(lines) + "\n"

    def _insert_inner_refs(self, parent_iname: str, inner_refs: List,
                           lines: List[str], indent: str):
        """Recursively insert inner class stubs before the parent's closing brace."""
        if not inner_refs:
            return
        closing = lines.pop()  # remove the closing "}"
        for inner_ref in inner_refs:
            inner_simple = inner_ref.internal_name.rsplit('$', 1)[-1]
            if not inner_simple or inner_simple[0].isdigit():
                continue  # anonymous / invalid
            lines.append("")
            inner_kind = inner_ref.kind
            if inner_kind == "annotation":
                self._emit_annotation(inner_ref, inner_simple, lines, indent,
                                      is_inner=True)
            elif inner_kind == "interface":
                self._emit_interface(inner_ref, inner_simple, lines, indent,
                                     is_inner=True)
            elif inner_kind == "exception":
                self._emit_exception(inner_ref, inner_simple, lines, indent,
                                     is_inner=True)
            else:
                self._emit_class(inner_ref, inner_simple, lines, indent,
                                 is_inner=True)
            # Recursively emit inner-of-inner classes
            child_prefix = inner_ref.internal_name + '$'
            child_refs = [r for r in self.ext_refs.values()
                          if r.internal_name.startswith(child_prefix)
                          and '$' not in r.internal_name[len(child_prefix):]]
            if child_refs:
                self._insert_inner_refs(inner_ref.internal_name, child_refs,
                                        lines, indent + "    ")
        lines.append(closing)  # re-add the closing "}"

    def _emit_annotation(self, ref: ExternalClassRef, simple: str,
                         lines: List[str], indent: str, is_inner: bool = False):
        mod = "public static " if is_inner else "public "
        lines.append(f"{indent}@java.lang.annotation.Retention("
                     f"java.lang.annotation.RetentionPolicy.RUNTIME)")
        lines.append(f"{indent}{mod}@interface {simple} {{")
        # Emit elements from collected annotation usages
        for elem_name, tag in ref.annotation_elements.items():
            etype = self._annotation_element_type(tag)
            default = self._annotation_element_default(tag)
            lines.append(f"{indent}    {etype} {elem_name}() default {default};")
        lines.append(f"{indent}}}")

    def _emit_interface(self, ref: ExternalClassRef, simple: str,
                        lines: List[str], indent: str, is_inner: bool = False):
        mod = "public static " if is_inner else "public "
        tparams = ""
        if ref.type_param_count > 0:
            tparams = "<" + ", ".join(f"T{i+1}" if ref.type_param_count > 1 else "T"
                                      for i in range(ref.type_param_count)) + ">"
        lines.append(f"{indent}{mod}interface {simple}{tparams} {{")
        # Don't emit fake members for interfaces — empty interface is sufficient.
        # Adding methods without proper throws clauses causes "cannot implement"
        # errors in classes that implement this interface with checked exceptions.
        lines.append(f"{indent}}}")

    def _emit_exception(self, ref: ExternalClassRef, simple: str,
                        lines: List[str], indent: str, is_inner: bool = False):
        mod = "public static " if is_inner else "public "
        lines.append(f"{indent}{mod}class {simple} extends java.lang.Exception {{")
        inner_indent = indent + "    "
        # Standard exception constructors
        lines.append(f"{inner_indent}public {simple}() {{ super(); }}")
        lines.append(f"{inner_indent}public {simple}(java.lang.String p0) "
                     f"{{ super(p0); }}")
        lines.append(f"{inner_indent}public {simple}(java.lang.String p0, "
                     f"java.lang.Throwable p1) {{ super(p0, p1); }}")
        lines.append(f"{inner_indent}public {simple}(java.lang.Throwable p0) "
                     f"{{ super(p0); }}")
        # Any additional constructors from CP refs
        seen_ctors = {"()V", "(Ljava/lang/String;)V",
                      "(Ljava/lang/String;Ljava/lang/Throwable;)V",
                      "(Ljava/lang/Throwable;)V"}
        for m in ref.members:
            if m.is_method and m.name == "<init>" and m.descriptor not in seen_ctors:
                seen_ctors.add(m.descriptor)
                params, _ = parse_method_descriptor(m.descriptor)
                pstr = ", ".join(f"{t} p{i}" for i, t in enumerate(params))
                lines.append(f"{inner_indent}public {simple}({pstr}) "
                             f"{{ super(); }}")
        self._emit_fake_members(ref, lines, inner_indent, is_interface=False,
                                skip_ctors=True)
        lines.append(f"{indent}}}")

    def _emit_class(self, ref: ExternalClassRef, simple: str,
                    lines: List[str], indent: str, is_inner: bool = False):
        mod = "public static " if is_inner else "public "
        tparams = ""
        if ref.type_param_count > 0:
            tparams = "<" + ", ".join(f"T{i+1}" if ref.type_param_count > 1 else "T"
                                      for i in range(ref.type_param_count)) + ">"
        lines.append(f"{indent}{mod}class {simple}{tparams} {{")
        inner_indent = indent + "    "

        # Constructors
        ctors_emitted = set()
        has_any_ctor = False
        for m in ref.members:
            if m.is_method and m.name == "<init>":
                if m.descriptor in ctors_emitted:
                    continue
                ctors_emitted.add(m.descriptor)
                params, _ = parse_method_descriptor(m.descriptor)
                pstr = ", ".join(f"{t} p{i}" for i, t in enumerate(params))
                lines.append(f"{inner_indent}public {simple}({pstr}) {{}}")
                has_any_ctor = True
        # Always provide a no-arg constructor if none emitted
        if not has_any_ctor:
            lines.append(f"{inner_indent}public {simple}() {{}}")

        self._emit_fake_members(ref, lines, inner_indent, is_interface=False,
                                skip_ctors=True)
        lines.append(f"{indent}}}")

    def _emit_fake_members(self, ref: ExternalClassRef, lines: List[str],
                           indent: str, is_interface: bool,
                           skip_ctors: bool = False):
        """Emit method and field stubs for an external class."""
        emitted_methods: Set[Tuple[str, str]] = set()
        emitted_fields: Set[Tuple[str, str]] = set()

        for m in ref.members:
            if m.name == "<init>" or m.name == "<clinit>":
                continue
            if m.is_method:
                key = (m.name, m.descriptor)
                if key in emitted_methods:
                    continue
                emitted_methods.add(key)
                params, ret = parse_method_descriptor(m.descriptor)
                pstr = ", ".join(f"{t} p{i}" for i, t in enumerate(params))
                if is_interface:
                    if ret == "void":
                        lines.append(f"{indent}{ret} {safe_name(m.name)}({pstr});")
                    else:
                        lines.append(f"{indent}{ret} {safe_name(m.name)}({pstr});")
                else:
                    ret_stmt = default_return(ret)
                    body = "{ " + ret_stmt + " }" if ret_stmt else "{}"
                    lines.append(
                        f"{indent}public {ret} {safe_name(m.name)}({pstr}) {body}")
            else:
                # Field
                key = (m.name, m.descriptor)
                if key in emitted_fields:
                    continue
                emitted_fields.add(key)
                ftype = descriptor_to_java(m.descriptor)
                dv = _default_field_value(m.descriptor)
                lines.append(
                    f"{indent}public {ftype} {safe_name(m.name)} = {dv};")

    @staticmethod
    def _annotation_element_type(tag: str) -> str:
        """Map annotation element tag to Java type."""
        mapping = {
            's': 'java.lang.String', 'I': 'int', 'J': 'long',
            'S': 'short', 'B': 'byte', 'Z': 'boolean',
            'F': 'float', 'D': 'double', 'C': 'char',
            'e': 'java.lang.String', 'c': 'java.lang.Class',
            '@': 'java.lang.annotation.Annotation',
        }
        return mapping.get(tag, 'java.lang.String')

    @staticmethod
    def _annotation_element_default(tag: str) -> str:
        """Default value for an annotation element."""
        mapping = {
            's': '""', 'I': '0', 'J': '0L', 'S': '0', 'B': '0',
            'Z': 'false', 'F': '0.0f', 'D': '0.0', 'C': "'\\0'",
            'e': '""', 'c': 'void.class', '@': '""',
        }
        return mapping.get(tag, '""')


# ── Main entry point ─────────────────────────────────────────────────────────

def parse_jar(jar_path: str) -> Dict[str, ClassInfo]:
    """Parse all .class entries from a JAR and return {internal_name: ClassInfo}."""
    classes: Dict[str, ClassInfo] = {}
    errors = 0
    with zipfile.ZipFile(jar_path, 'r') as zf:
        entries = [e for e in zf.namelist() if e.endswith('.class')]
        total = len(entries)
        print(f"Parsing {total} classes from {jar_path}...")
        for i, entry in enumerate(entries):
            if (i + 1) % 5000 == 0:
                print(f"  ...parsed {i + 1}/{total}")
            try:
                data = zf.read(entry)
                reader = ClassFileReader(data)
                ci = reader.parse()
                classes[ci.this_class] = ci
            except Exception as e:
                errors += 1
                if errors <= 20:
                    print(f"  WARN: Failed to parse {entry}: {e}", file=sys.stderr)
    print(f"Parsed {len(classes)} classes ({errors} errors).")
    return classes


def prune_erroring_stubs(output_dir: str, deps_dir: Optional[str] = None,
                         max_passes: int = 10) -> int:
    """Iteratively compile stubs, removing source files that cause errors.
    Returns the number of files removed."""
    import subprocess, re, glob, tempfile

    src_files = glob.glob(os.path.join(output_dir, '**', '*.java'), recursive=True)
    if not src_files:
        return 0

    # Build classpath from deps if available
    deps_classes = None
    if deps_dir:
        deps_classes = tempfile.mkdtemp(prefix='stubdeps_')
        deps_files = glob.glob(os.path.join(deps_dir, '**', '*.java'), recursive=True)
        if deps_files:
            with tempfile.NamedTemporaryFile(mode='w', suffix='.txt', delete=False) as f:
                f.write('\n'.join(deps_files))
                deps_argfile = f.name
            subprocess.run(
                ['javac', '-encoding', 'UTF-8', '-source', '17', '-target', '17',
                 '-d', deps_classes,
                 '-sourcepath', f'{deps_dir}{os.pathsep}{output_dir}',
                 '-Xmaxerrs', '50000', f'@{deps_argfile}'],
                capture_output=True, text=True)
            os.unlink(deps_argfile)

    total_removed = 0
    classes_dir = tempfile.mkdtemp(prefix='stubmain_')

    # Strategy: compile all files (no -sourcepath) so cross-references resolve
    # within the compilation unit.  On each pass, only remove files that have
    # "genuine" errors (not "cannot find symbol" / "does not exist" which are
    # cascade from previously-removed files).  Stop when only cascade errors
    # remain — the Gradle -sourcepath compilation will resolve those.
    for pass_num in range(1, max_passes + 1):
        src_files = glob.glob(os.path.join(output_dir, '**', '*.java'), recursive=True)
        if not src_files:
            break

        with tempfile.NamedTemporaryFile(mode='w', suffix='.txt', delete=False) as f:
            f.write('\n'.join(src_files))
            argfile = f.name

        cmd = ['javac', '-encoding', 'UTF-8', '-source', '17', '-target', '17',
               '-d', classes_dir, '-Xmaxerrs', '50000', f'@{argfile}']
        if deps_classes:
            cmd.extend(['-classpath', deps_classes])

        result = subprocess.run(cmd, capture_output=True, text=True)
        os.unlink(argfile)

        if result.returncode == 0:
            print(f"  Prune pass {pass_num}: 0 errors, compilation clean.")
            break

        # Classify each file: genuine error vs cascade-only
        all_err_files: Dict[str, List[str]] = {}
        for line in result.stderr.splitlines():
            m = re.match(r'^(.+\.java):\d+: error: (.*)', line)
            if m:
                fpath = os.path.normpath(m.group(1))
                err_msg = m.group(2)
                all_err_files.setdefault(fpath, []).append(err_msg)

        genuine_files = set()
        for fpath, msgs in all_err_files.items():
            has_genuine = any(
                'cannot find symbol' not in msg and 'does not exist' not in msg
                for msg in msgs)
            if has_genuine:
                genuine_files.add(fpath)

        if not genuine_files:
            # Only cascade errors remain — stop pruning
            print(f"  Prune pass {pass_num}: {len(all_err_files)} files with cascade errors only, stopping.")
            break

        for f in genuine_files:
            if os.path.isfile(f):
                os.remove(f)
        total_removed += len(genuine_files)
        print(f"  Prune pass {pass_num}: removed {len(genuine_files)} erroring files ({total_removed} total).")

    # Cleanup temp dirs
    import shutil
    shutil.rmtree(classes_dir, ignore_errors=True)
    if deps_classes:
        shutil.rmtree(deps_classes, ignore_errors=True)

    return total_removed


def main():
    args = sys.argv[1:]
    fake_deps = "--fake-deps" in args
    prune = "--prune" in args
    args = [a for a in args if a not in ("--fake-deps", "--prune")]

    if len(args) < 2:
        print(f"Usage: {sys.argv[0]} <input.jar> <output_dir> [--fake-deps] [--prune]")
        sys.exit(1)

    jar_path = args[0]
    output_dir = args[1]

    if not os.path.isfile(jar_path):
        print(f"Error: {jar_path} not found")
        sys.exit(1)

    classes = parse_jar(jar_path)

    if fake_deps:
        # Collect external refs BEFORE generating stubs (need CP scan)
        ext_refs = collect_external_refs(classes, jar_path)
        # Populate external constructors so _build_super_call can use them
        _populate_external_constructors(ext_refs)

    gen = StubGenerator(classes)
    gen.generate_all(output_dir)

    if fake_deps:
        # Output fake deps to a separate directory so they can be treated as
        # compileOnly dependencies — they won't end up in the final JAR.
        deps_dir = output_dir.rstrip('/\\') + "-deps"
        print(f"\nGenerating fake dependency stubs into {deps_dir}...")
        fake_gen = FakeDepsGenerator(ext_refs, set(classes.keys()))
        fake_gen.generate_all(deps_dir)
        print(f"\nTo compile:")
        print(f"  javac -encoding UTF-8 -source 17 -target 17 \\")
        print(f"    -d <classes_dir> \\")
        print(f"    -sourcepath {output_dir} \\")
        print(f"    -classpath {deps_dir} \\")
        print(f"    <source files from {output_dir}>")
        print(f"\nThe -deps folder is compile-only; only {output_dir} classes go in the JAR.")

    if prune:
        deps_dir = output_dir.rstrip('/\\') + "-deps" if fake_deps else None
        print(f"\nPruning erroring stubs...")
        removed = prune_erroring_stubs(output_dir, deps_dir)
        if removed:
            print(f"Pruned {removed} erroring source files.")
        else:
            print("No erroring files found — all stubs compile cleanly.")


if __name__ == "__main__":
    main()
