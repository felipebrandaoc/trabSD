/**
 * Autogenerated by Thrift Compiler (0.9.1)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package models;

import org.apache.thrift.scheme.IScheme;
import org.apache.thrift.scheme.SchemeFactory;
import org.apache.thrift.scheme.StandardScheme;

import org.apache.thrift.scheme.TupleScheme;
import org.apache.thrift.protocol.TTupleProtocol;
import org.apache.thrift.protocol.TProtocolException;
import org.apache.thrift.EncodingUtils;
import org.apache.thrift.TException;
import org.apache.thrift.async.AsyncMethodCallback;
import org.apache.thrift.server.AbstractNonblockingServer.*;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
import java.util.EnumMap;
import java.util.Set;
import java.util.HashSet;
import java.util.EnumSet;
import java.util.Collections;
import java.util.BitSet;
import java.nio.ByteBuffer;
import java.util.Arrays;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Grafo implements org.apache.thrift.TBase<Grafo, Grafo._Fields>, java.io.Serializable, Cloneable, Comparable<Grafo> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("Grafo");

  private static final org.apache.thrift.protocol.TField V_FIELD_DESC = new org.apache.thrift.protocol.TField("v", org.apache.thrift.protocol.TType.LIST, (short)1);
  private static final org.apache.thrift.protocol.TField A_FIELD_DESC = new org.apache.thrift.protocol.TField("a", org.apache.thrift.protocol.TType.LIST, (short)2);

  private static final Map<Class<? extends IScheme>, SchemeFactory> schemes = new HashMap<Class<? extends IScheme>, SchemeFactory>();
  static {
    schemes.put(StandardScheme.class, new GrafoStandardSchemeFactory());
    schemes.put(TupleScheme.class, new GrafoTupleSchemeFactory());
  }

  public List<Vertice> v; // required
  public List<Aresta> a; // required

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    V((short)1, "v"),
    A((short)2, "a");

    private static final Map<String, _Fields> byName = new HashMap<String, _Fields>();

    static {
      for (_Fields field : EnumSet.allOf(_Fields.class)) {
        byName.put(field.getFieldName(), field);
      }
    }

    /**
     * Find the _Fields constant that matches fieldId, or null if its not found.
     */
    public static _Fields findByThriftId(int fieldId) {
      switch(fieldId) {
        case 1: // V
          return V;
        case 2: // A
          return A;
        default:
          return null;
      }
    }

    /**
     * Find the _Fields constant that matches fieldId, throwing an exception
     * if it is not found.
     */
    public static _Fields findByThriftIdOrThrow(int fieldId) {
      _Fields fields = findByThriftId(fieldId);
      if (fields == null) throw new IllegalArgumentException("Field " + fieldId + " doesn't exist!");
      return fields;
    }

    /**
     * Find the _Fields constant that matches name, or null if its not found.
     */
    public static _Fields findByName(String name) {
      return byName.get(name);
    }

    private final short _thriftId;
    private final String _fieldName;

    _Fields(short thriftId, String fieldName) {
      _thriftId = thriftId;
      _fieldName = fieldName;
    }

    public short getThriftFieldId() {
      return _thriftId;
    }

    public String getFieldName() {
      return _fieldName;
    }
  }

  // isset id assignments
  public static final Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.V, new org.apache.thrift.meta_data.FieldMetaData("v", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.ListMetaData(org.apache.thrift.protocol.TType.LIST, 
            new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, Vertice.class))));
    tmpMap.put(_Fields.A, new org.apache.thrift.meta_data.FieldMetaData("a", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.ListMetaData(org.apache.thrift.protocol.TType.LIST, 
            new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, Aresta.class))));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(Grafo.class, metaDataMap);
  }

  public Grafo() {
  }

  public Grafo(
    List<Vertice> v,
    List<Aresta> a)
  {
    this();
    this.v = v;
    this.a = a;
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public Grafo(Grafo other) {
    if (other.isSetV()) {
      List<Vertice> __this__v = new ArrayList<Vertice>(other.v.size());
      for (Vertice other_element : other.v) {
        __this__v.add(new Vertice(other_element));
      }
      this.v = __this__v;
    }
    if (other.isSetA()) {
      List<Aresta> __this__a = new ArrayList<Aresta>(other.a.size());
      for (Aresta other_element : other.a) {
        __this__a.add(new Aresta(other_element));
      }
      this.a = __this__a;
    }
  }

  public Grafo deepCopy() {
    return new Grafo(this);
  }

  @Override
  public void clear() {
    this.v = null;
    this.a = null;
  }

  public int getVSize() {
    return (this.v == null) ? 0 : this.v.size();
  }

  public java.util.Iterator<Vertice> getVIterator() {
    return (this.v == null) ? null : this.v.iterator();
  }

  public void addToV(Vertice elem) {
    if (this.v == null) {
      this.v = new ArrayList<Vertice>();
    }
    this.v.add(elem);
  }

  public List<Vertice> getV() {
    return this.v;
  }

  public Grafo setV(List<Vertice> v) {
    this.v = v;
    return this;
  }

  public void unsetV() {
    this.v = null;
  }

  /** Returns true if field v is set (has been assigned a value) and false otherwise */
  public boolean isSetV() {
    return this.v != null;
  }

  public void setVIsSet(boolean value) {
    if (!value) {
      this.v = null;
    }
  }

  public int getASize() {
    return (this.a == null) ? 0 : this.a.size();
  }

  public java.util.Iterator<Aresta> getAIterator() {
    return (this.a == null) ? null : this.a.iterator();
  }

  public void addToA(Aresta elem) {
    if (this.a == null) {
      this.a = new ArrayList<Aresta>();
    }
    this.a.add(elem);
  }

  public List<Aresta> getA() {
    return this.a;
  }

  public Grafo setA(List<Aresta> a) {
    this.a = a;
    return this;
  }

  public void unsetA() {
    this.a = null;
  }

  /** Returns true if field a is set (has been assigned a value) and false otherwise */
  public boolean isSetA() {
    return this.a != null;
  }

  public void setAIsSet(boolean value) {
    if (!value) {
      this.a = null;
    }
  }

  public void setFieldValue(_Fields field, Object value) {
    switch (field) {
    case V:
      if (value == null) {
        unsetV();
      } else {
        setV((List<Vertice>)value);
      }
      break;

    case A:
      if (value == null) {
        unsetA();
      } else {
        setA((List<Aresta>)value);
      }
      break;

    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case V:
      return getV();

    case A:
      return getA();

    }
    throw new IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new IllegalArgumentException();
    }

    switch (field) {
    case V:
      return isSetV();
    case A:
      return isSetA();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof Grafo)
      return this.equals((Grafo)that);
    return false;
  }

  public boolean equals(Grafo that) {
    if (that == null)
      return false;

    boolean this_present_v = true && this.isSetV();
    boolean that_present_v = true && that.isSetV();
    if (this_present_v || that_present_v) {
      if (!(this_present_v && that_present_v))
        return false;
      if (!this.v.equals(that.v))
        return false;
    }

    boolean this_present_a = true && this.isSetA();
    boolean that_present_a = true && that.isSetA();
    if (this_present_a || that_present_a) {
      if (!(this_present_a && that_present_a))
        return false;
      if (!this.a.equals(that.a))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    return 0;
  }

  @Override
  public int compareTo(Grafo other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = Boolean.valueOf(isSetV()).compareTo(other.isSetV());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetV()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.v, other.v);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetA()).compareTo(other.isSetA());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetA()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.a, other.a);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    return 0;
  }

  public _Fields fieldForId(int fieldId) {
    return _Fields.findByThriftId(fieldId);
  }

  public void read(org.apache.thrift.protocol.TProtocol iprot) throws org.apache.thrift.TException {
    schemes.get(iprot.getScheme()).getScheme().read(iprot, this);
  }

  public void write(org.apache.thrift.protocol.TProtocol oprot) throws org.apache.thrift.TException {
    schemes.get(oprot.getScheme()).getScheme().write(oprot, this);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder("Grafo(");
    boolean first = true;

    sb.append("v:");
    if (this.v == null) {
      sb.append("null");
    } else {
      sb.append(this.v);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("a:");
    if (this.a == null) {
      sb.append("null");
    } else {
      sb.append(this.a);
    }
    first = false;
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws org.apache.thrift.TException {
    // check for required fields
    // check for sub-struct validity
  }

  private void writeObject(java.io.ObjectOutputStream out) throws java.io.IOException {
    try {
      write(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(out)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private void readObject(java.io.ObjectInputStream in) throws java.io.IOException, ClassNotFoundException {
    try {
      read(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(in)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private static class GrafoStandardSchemeFactory implements SchemeFactory {
    public GrafoStandardScheme getScheme() {
      return new GrafoStandardScheme();
    }
  }

  private static class GrafoStandardScheme extends StandardScheme<Grafo> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, Grafo struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // V
            if (schemeField.type == org.apache.thrift.protocol.TType.LIST) {
              {
                org.apache.thrift.protocol.TList _list0 = iprot.readListBegin();
                struct.v = new ArrayList<Vertice>(_list0.size);
                for (int _i1 = 0; _i1 < _list0.size; ++_i1)
                {
                  Vertice _elem2;
                  _elem2 = new Vertice();
                  _elem2.read(iprot);
                  struct.v.add(_elem2);
                }
                iprot.readListEnd();
              }
              struct.setVIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // A
            if (schemeField.type == org.apache.thrift.protocol.TType.LIST) {
              {
                org.apache.thrift.protocol.TList _list3 = iprot.readListBegin();
                struct.a = new ArrayList<Aresta>(_list3.size);
                for (int _i4 = 0; _i4 < _list3.size; ++_i4)
                {
                  Aresta _elem5;
                  _elem5 = new Aresta();
                  _elem5.read(iprot);
                  struct.a.add(_elem5);
                }
                iprot.readListEnd();
              }
              struct.setAIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          default:
            org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
        }
        iprot.readFieldEnd();
      }
      iprot.readStructEnd();

      // check for required fields of primitive type, which can't be checked in the validate method
      struct.validate();
    }

    public void write(org.apache.thrift.protocol.TProtocol oprot, Grafo struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.v != null) {
        oprot.writeFieldBegin(V_FIELD_DESC);
        {
          oprot.writeListBegin(new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.STRUCT, struct.v.size()));
          for (Vertice _iter6 : struct.v)
          {
            _iter6.write(oprot);
          }
          oprot.writeListEnd();
        }
        oprot.writeFieldEnd();
      }
      if (struct.a != null) {
        oprot.writeFieldBegin(A_FIELD_DESC);
        {
          oprot.writeListBegin(new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.STRUCT, struct.a.size()));
          for (Aresta _iter7 : struct.a)
          {
            _iter7.write(oprot);
          }
          oprot.writeListEnd();
        }
        oprot.writeFieldEnd();
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class GrafoTupleSchemeFactory implements SchemeFactory {
    public GrafoTupleScheme getScheme() {
      return new GrafoTupleScheme();
    }
  }

  private static class GrafoTupleScheme extends TupleScheme<Grafo> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, Grafo struct) throws org.apache.thrift.TException {
      TTupleProtocol oprot = (TTupleProtocol) prot;
      BitSet optionals = new BitSet();
      if (struct.isSetV()) {
        optionals.set(0);
      }
      if (struct.isSetA()) {
        optionals.set(1);
      }
      oprot.writeBitSet(optionals, 2);
      if (struct.isSetV()) {
        {
          oprot.writeI32(struct.v.size());
          for (Vertice _iter8 : struct.v)
          {
            _iter8.write(oprot);
          }
        }
      }
      if (struct.isSetA()) {
        {
          oprot.writeI32(struct.a.size());
          for (Aresta _iter9 : struct.a)
          {
            _iter9.write(oprot);
          }
        }
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, Grafo struct) throws org.apache.thrift.TException {
      TTupleProtocol iprot = (TTupleProtocol) prot;
      BitSet incoming = iprot.readBitSet(2);
      if (incoming.get(0)) {
        {
          org.apache.thrift.protocol.TList _list10 = new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.STRUCT, iprot.readI32());
          struct.v = new ArrayList<Vertice>(_list10.size);
          for (int _i11 = 0; _i11 < _list10.size; ++_i11)
          {
            Vertice _elem12;
            _elem12 = new Vertice();
            _elem12.read(iprot);
            struct.v.add(_elem12);
          }
        }
        struct.setVIsSet(true);
      }
      if (incoming.get(1)) {
        {
          org.apache.thrift.protocol.TList _list13 = new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.STRUCT, iprot.readI32());
          struct.a = new ArrayList<Aresta>(_list13.size);
          for (int _i14 = 0; _i14 < _list13.size; ++_i14)
          {
            Aresta _elem15;
            _elem15 = new Aresta();
            _elem15.read(iprot);
            struct.a.add(_elem15);
          }
        }
        struct.setAIsSet(true);
      }
    }
  }

}
