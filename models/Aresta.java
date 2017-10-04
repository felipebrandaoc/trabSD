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

public class Aresta implements org.apache.thrift.TBase<Aresta, Aresta._Fields>, java.io.Serializable, Cloneable, Comparable<Aresta> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("Aresta");

  private static final org.apache.thrift.protocol.TField V1_FIELD_DESC = new org.apache.thrift.protocol.TField("v1", org.apache.thrift.protocol.TType.I32, (short)1);
  private static final org.apache.thrift.protocol.TField V2_FIELD_DESC = new org.apache.thrift.protocol.TField("v2", org.apache.thrift.protocol.TType.I32, (short)2);
  private static final org.apache.thrift.protocol.TField PESO_FIELD_DESC = new org.apache.thrift.protocol.TField("peso", org.apache.thrift.protocol.TType.DOUBLE, (short)3);
  private static final org.apache.thrift.protocol.TField DIRECAO_FIELD_DESC = new org.apache.thrift.protocol.TField("direcao", org.apache.thrift.protocol.TType.I32, (short)4);
  private static final org.apache.thrift.protocol.TField DESCRICAO_FIELD_DESC = new org.apache.thrift.protocol.TField("descricao", org.apache.thrift.protocol.TType.STRING, (short)5);

  private static final Map<Class<? extends IScheme>, SchemeFactory> schemes = new HashMap<Class<? extends IScheme>, SchemeFactory>();
  static {
    schemes.put(StandardScheme.class, new ArestaStandardSchemeFactory());
    schemes.put(TupleScheme.class, new ArestaTupleSchemeFactory());
  }

  public int v1; // required
  public int v2; // required
  public double peso; // required
  public int direcao; // required
  public String descricao; // required

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    V1((short)1, "v1"),
    V2((short)2, "v2"),
    PESO((short)3, "peso"),
    DIRECAO((short)4, "direcao"),
    DESCRICAO((short)5, "descricao");

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
        case 1: // V1
          return V1;
        case 2: // V2
          return V2;
        case 3: // PESO
          return PESO;
        case 4: // DIRECAO
          return DIRECAO;
        case 5: // DESCRICAO
          return DESCRICAO;
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
  private static final int __V1_ISSET_ID = 0;
  private static final int __V2_ISSET_ID = 1;
  private static final int __PESO_ISSET_ID = 2;
  private static final int __DIRECAO_ISSET_ID = 3;
  private byte __isset_bitfield = 0;
  public static final Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.V1, new org.apache.thrift.meta_data.FieldMetaData("v1", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I32)));
    tmpMap.put(_Fields.V2, new org.apache.thrift.meta_data.FieldMetaData("v2", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I32)));
    tmpMap.put(_Fields.PESO, new org.apache.thrift.meta_data.FieldMetaData("peso", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.DOUBLE)));
    tmpMap.put(_Fields.DIRECAO, new org.apache.thrift.meta_data.FieldMetaData("direcao", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I32)));
    tmpMap.put(_Fields.DESCRICAO, new org.apache.thrift.meta_data.FieldMetaData("descricao", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(Aresta.class, metaDataMap);
  }

  public Aresta() {
  }

  public Aresta(
    int v1,
    int v2,
    double peso,
    int direcao,
    String descricao)
  {
    this();
    this.v1 = v1;
    setV1IsSet(true);
    this.v2 = v2;
    setV2IsSet(true);
    this.peso = peso;
    setPesoIsSet(true);
    this.direcao = direcao;
    setDirecaoIsSet(true);
    this.descricao = descricao;
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public Aresta(Aresta other) {
    __isset_bitfield = other.__isset_bitfield;
    this.v1 = other.v1;
    this.v2 = other.v2;
    this.peso = other.peso;
    this.direcao = other.direcao;
    if (other.isSetDescricao()) {
      this.descricao = other.descricao;
    }
  }

  public Aresta deepCopy() {
    return new Aresta(this);
  }

  @Override
  public void clear() {
    setV1IsSet(false);
    this.v1 = 0;
    setV2IsSet(false);
    this.v2 = 0;
    setPesoIsSet(false);
    this.peso = 0.0;
    setDirecaoIsSet(false);
    this.direcao = 0;
    this.descricao = null;
  }

  public int getV1() {
    return this.v1;
  }

  public Aresta setV1(int v1) {
    this.v1 = v1;
    setV1IsSet(true);
    return this;
  }

  public void unsetV1() {
    __isset_bitfield = EncodingUtils.clearBit(__isset_bitfield, __V1_ISSET_ID);
  }

  /** Returns true if field v1 is set (has been assigned a value) and false otherwise */
  public boolean isSetV1() {
    return EncodingUtils.testBit(__isset_bitfield, __V1_ISSET_ID);
  }

  public void setV1IsSet(boolean value) {
    __isset_bitfield = EncodingUtils.setBit(__isset_bitfield, __V1_ISSET_ID, value);
  }

  public int getV2() {
    return this.v2;
  }

  public Aresta setV2(int v2) {
    this.v2 = v2;
    setV2IsSet(true);
    return this;
  }

  public void unsetV2() {
    __isset_bitfield = EncodingUtils.clearBit(__isset_bitfield, __V2_ISSET_ID);
  }

  /** Returns true if field v2 is set (has been assigned a value) and false otherwise */
  public boolean isSetV2() {
    return EncodingUtils.testBit(__isset_bitfield, __V2_ISSET_ID);
  }

  public void setV2IsSet(boolean value) {
    __isset_bitfield = EncodingUtils.setBit(__isset_bitfield, __V2_ISSET_ID, value);
  }

  public double getPeso() {
    return this.peso;
  }

  public Aresta setPeso(double peso) {
    this.peso = peso;
    setPesoIsSet(true);
    return this;
  }

  public void unsetPeso() {
    __isset_bitfield = EncodingUtils.clearBit(__isset_bitfield, __PESO_ISSET_ID);
  }

  /** Returns true if field peso is set (has been assigned a value) and false otherwise */
  public boolean isSetPeso() {
    return EncodingUtils.testBit(__isset_bitfield, __PESO_ISSET_ID);
  }

  public void setPesoIsSet(boolean value) {
    __isset_bitfield = EncodingUtils.setBit(__isset_bitfield, __PESO_ISSET_ID, value);
  }

  public int getDirecao() {
    return this.direcao;
  }

  public Aresta setDirecao(int direcao) {
    this.direcao = direcao;
    setDirecaoIsSet(true);
    return this;
  }

  public void unsetDirecao() {
    __isset_bitfield = EncodingUtils.clearBit(__isset_bitfield, __DIRECAO_ISSET_ID);
  }

  /** Returns true if field direcao is set (has been assigned a value) and false otherwise */
  public boolean isSetDirecao() {
    return EncodingUtils.testBit(__isset_bitfield, __DIRECAO_ISSET_ID);
  }

  public void setDirecaoIsSet(boolean value) {
    __isset_bitfield = EncodingUtils.setBit(__isset_bitfield, __DIRECAO_ISSET_ID, value);
  }

  public String getDescricao() {
    return this.descricao;
  }

  public Aresta setDescricao(String descricao) {
    this.descricao = descricao;
    return this;
  }

  public void unsetDescricao() {
    this.descricao = null;
  }

  /** Returns true if field descricao is set (has been assigned a value) and false otherwise */
  public boolean isSetDescricao() {
    return this.descricao != null;
  }

  public void setDescricaoIsSet(boolean value) {
    if (!value) {
      this.descricao = null;
    }
  }

  public void setFieldValue(_Fields field, Object value) {
    switch (field) {
    case V1:
      if (value == null) {
        unsetV1();
      } else {
        setV1((Integer)value);
      }
      break;

    case V2:
      if (value == null) {
        unsetV2();
      } else {
        setV2((Integer)value);
      }
      break;

    case PESO:
      if (value == null) {
        unsetPeso();
      } else {
        setPeso((Double)value);
      }
      break;

    case DIRECAO:
      if (value == null) {
        unsetDirecao();
      } else {
        setDirecao((Integer)value);
      }
      break;

    case DESCRICAO:
      if (value == null) {
        unsetDescricao();
      } else {
        setDescricao((String)value);
      }
      break;

    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case V1:
      return Integer.valueOf(getV1());

    case V2:
      return Integer.valueOf(getV2());

    case PESO:
      return Double.valueOf(getPeso());

    case DIRECAO:
      return Integer.valueOf(getDirecao());

    case DESCRICAO:
      return getDescricao();

    }
    throw new IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new IllegalArgumentException();
    }

    switch (field) {
    case V1:
      return isSetV1();
    case V2:
      return isSetV2();
    case PESO:
      return isSetPeso();
    case DIRECAO:
      return isSetDirecao();
    case DESCRICAO:
      return isSetDescricao();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof Aresta)
      return this.equals((Aresta)that);
    return false;
  }

  public boolean equals(Aresta that) {
    if (that == null)
      return false;

    boolean this_present_v1 = true;
    boolean that_present_v1 = true;
    if (this_present_v1 || that_present_v1) {
      if (!(this_present_v1 && that_present_v1))
        return false;
      if (this.v1 != that.v1)
        return false;
    }

    boolean this_present_v2 = true;
    boolean that_present_v2 = true;
    if (this_present_v2 || that_present_v2) {
      if (!(this_present_v2 && that_present_v2))
        return false;
      if (this.v2 != that.v2)
        return false;
    }

    boolean this_present_peso = true;
    boolean that_present_peso = true;
    if (this_present_peso || that_present_peso) {
      if (!(this_present_peso && that_present_peso))
        return false;
      if (this.peso != that.peso)
        return false;
    }

    boolean this_present_direcao = true;
    boolean that_present_direcao = true;
    if (this_present_direcao || that_present_direcao) {
      if (!(this_present_direcao && that_present_direcao))
        return false;
      if (this.direcao != that.direcao)
        return false;
    }

    boolean this_present_descricao = true && this.isSetDescricao();
    boolean that_present_descricao = true && that.isSetDescricao();
    if (this_present_descricao || that_present_descricao) {
      if (!(this_present_descricao && that_present_descricao))
        return false;
      if (!this.descricao.equals(that.descricao))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    return 0;
  }

  @Override
  public int compareTo(Aresta other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = Boolean.valueOf(isSetV1()).compareTo(other.isSetV1());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetV1()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.v1, other.v1);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetV2()).compareTo(other.isSetV2());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetV2()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.v2, other.v2);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetPeso()).compareTo(other.isSetPeso());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetPeso()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.peso, other.peso);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetDirecao()).compareTo(other.isSetDirecao());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetDirecao()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.direcao, other.direcao);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetDescricao()).compareTo(other.isSetDescricao());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetDescricao()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.descricao, other.descricao);
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
    StringBuilder sb = new StringBuilder("Aresta(");
    boolean first = true;

    sb.append("v1:");
    sb.append(this.v1);
    first = false;
    if (!first) sb.append(", ");
    sb.append("v2:");
    sb.append(this.v2);
    first = false;
    if (!first) sb.append(", ");
    sb.append("peso:");
    sb.append(this.peso);
    first = false;
    if (!first) sb.append(", ");
    sb.append("direcao:");
    sb.append(this.direcao);
    first = false;
    if (!first) sb.append(", ");
    sb.append("descricao:");
    if (this.descricao == null) {
      sb.append("null");
    } else {
      sb.append(this.descricao);
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
      // it doesn't seem like you should have to do this, but java serialization is wacky, and doesn't call the default constructor.
      __isset_bitfield = 0;
      read(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(in)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private static class ArestaStandardSchemeFactory implements SchemeFactory {
    public ArestaStandardScheme getScheme() {
      return new ArestaStandardScheme();
    }
  }

  private static class ArestaStandardScheme extends StandardScheme<Aresta> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, Aresta struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // V1
            if (schemeField.type == org.apache.thrift.protocol.TType.I32) {
              struct.v1 = iprot.readI32();
              struct.setV1IsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // V2
            if (schemeField.type == org.apache.thrift.protocol.TType.I32) {
              struct.v2 = iprot.readI32();
              struct.setV2IsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 3: // PESO
            if (schemeField.type == org.apache.thrift.protocol.TType.DOUBLE) {
              struct.peso = iprot.readDouble();
              struct.setPesoIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 4: // DIRECAO
            if (schemeField.type == org.apache.thrift.protocol.TType.I32) {
              struct.direcao = iprot.readI32();
              struct.setDirecaoIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 5: // DESCRICAO
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.descricao = iprot.readString();
              struct.setDescricaoIsSet(true);
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

    public void write(org.apache.thrift.protocol.TProtocol oprot, Aresta struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      oprot.writeFieldBegin(V1_FIELD_DESC);
      oprot.writeI32(struct.v1);
      oprot.writeFieldEnd();
      oprot.writeFieldBegin(V2_FIELD_DESC);
      oprot.writeI32(struct.v2);
      oprot.writeFieldEnd();
      oprot.writeFieldBegin(PESO_FIELD_DESC);
      oprot.writeDouble(struct.peso);
      oprot.writeFieldEnd();
      oprot.writeFieldBegin(DIRECAO_FIELD_DESC);
      oprot.writeI32(struct.direcao);
      oprot.writeFieldEnd();
      if (struct.descricao != null) {
        oprot.writeFieldBegin(DESCRICAO_FIELD_DESC);
        oprot.writeString(struct.descricao);
        oprot.writeFieldEnd();
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class ArestaTupleSchemeFactory implements SchemeFactory {
    public ArestaTupleScheme getScheme() {
      return new ArestaTupleScheme();
    }
  }

  private static class ArestaTupleScheme extends TupleScheme<Aresta> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, Aresta struct) throws org.apache.thrift.TException {
      TTupleProtocol oprot = (TTupleProtocol) prot;
      BitSet optionals = new BitSet();
      if (struct.isSetV1()) {
        optionals.set(0);
      }
      if (struct.isSetV2()) {
        optionals.set(1);
      }
      if (struct.isSetPeso()) {
        optionals.set(2);
      }
      if (struct.isSetDirecao()) {
        optionals.set(3);
      }
      if (struct.isSetDescricao()) {
        optionals.set(4);
      }
      oprot.writeBitSet(optionals, 5);
      if (struct.isSetV1()) {
        oprot.writeI32(struct.v1);
      }
      if (struct.isSetV2()) {
        oprot.writeI32(struct.v2);
      }
      if (struct.isSetPeso()) {
        oprot.writeDouble(struct.peso);
      }
      if (struct.isSetDirecao()) {
        oprot.writeI32(struct.direcao);
      }
      if (struct.isSetDescricao()) {
        oprot.writeString(struct.descricao);
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, Aresta struct) throws org.apache.thrift.TException {
      TTupleProtocol iprot = (TTupleProtocol) prot;
      BitSet incoming = iprot.readBitSet(5);
      if (incoming.get(0)) {
        struct.v1 = iprot.readI32();
        struct.setV1IsSet(true);
      }
      if (incoming.get(1)) {
        struct.v2 = iprot.readI32();
        struct.setV2IsSet(true);
      }
      if (incoming.get(2)) {
        struct.peso = iprot.readDouble();
        struct.setPesoIsSet(true);
      }
      if (incoming.get(3)) {
        struct.direcao = iprot.readI32();
        struct.setDirecaoIsSet(true);
      }
      if (incoming.get(4)) {
        struct.descricao = iprot.readString();
        struct.setDescricaoIsSet(true);
      }
    }
  }

}
