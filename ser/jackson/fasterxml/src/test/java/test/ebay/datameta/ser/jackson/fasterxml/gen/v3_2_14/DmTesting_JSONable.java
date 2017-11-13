
package test.ebay.datameta.ser.jackson.fasterxml.gen.v3_2_14;

import static org.ebay.datameta.ser.jackson.fasterxml.JacksonUtil.*;
import org.ebay.datameta.ser.jackson.fasterxml.JacksonUtil;
import org.ebay.datameta.ser.jackson.fasterxml.Jsonable;
import com.fasterxml.jackson.core.JsonFactory;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;

import java.io.IOException;

import static com.fasterxml.jackson.core.JsonToken.END_ARRAY;
import static com.fasterxml.jackson.core.JsonToken.END_OBJECT;

/**
 * Json Serializer/Deserializer for the type {@link DmTesting}.
 * This class is completely immutable, state-free and therefore thread-safe, implemented and used as a singleton.
 */
/**

 * This class is generated by
 * <a href='https://github.com/eBayDataMeta/DataMeta'>DataMeta</a>.
 */
public class DmTesting_JSONable extends Jsonable<DmTesting> {

  /** An instance of the {@link JacksonUtil} - can use it anywhere because {@link JacksonUtil} is a singleton,
   * immutable and state-free.
   */
  public final static JacksonUtil JU = JacksonUtil.getInstance();

  public static DmTesting_JSONable getInstance() { return INSTANCE; }

  private final static DmTesting_JSONable INSTANCE = new DmTesting_JSONable();

  /**
   * Constructor is private - use {@link #getInstance()} to get an instance.
   */
  private DmTesting_JSONable() {}

  public void write(final JsonGenerator out, final DmTesting value) throws IOException {
    value.verify();

    if(value.getColor() != null) out.writeStringField("color", value.getColor().name());
    JU.writeDttmFld("created", out, value.getCreated());
    out.writeStringField("email", value.getEmail());
    TestingDm_JSONable.getInstance().writeField("embedded", out, value.getEmbedded());
    if(value.getEmbs() != null) JU.writeCollectionFld("embs", out, value.getEmbs(), TestingDm_JSONable.getInstance());
    out.writeNumberField("intVal", value.getIntVal());
    out.writeNumberField("longVal", value.getLongVal());
    if(value.getName() != null) out.writeStringField("name", value.getName());
    out.writeNumberField("salary", value.getSalary());
  }

  public DmTesting readInto(final JsonParser in, final DmTesting target, final boolean ignoreUnknown) throws IOException {
    while(in.nextToken() != END_OBJECT) {
      final String fldName = in.getCurrentName();
      if(fldName != null) {
        in.nextToken();
        switch(fldName){
            case "*v*": break; // skip the version field
            case "*dt*": break;  // skip the data type field

            case "color":
              target.setColor(Enum.valueOf(Colors.class, JU.readText(in)));
              break;

            case "created":
              target.setCreated(JU.readDttm(in));
              break;

            case "email":
              target.setEmail(JU.readText(in));
              break;

            case "embedded":
              target.setEmbedded(TestingDm_JSONable.getInstance().read(in));
              break;

            case "embs":
              target.setEmbs(JU.readList(in, TestingDm_JSONable.getInstance()));
              break;

            case "intVal":
              target.setIntVal(in.getIntValue());
              break;

            case "longVal":
              target.setLongVal(in.getLongValue());
              break;

            case "name":
              target.setName(JU.readText(in));
              break;

            case "salary":
              target.setSalary(JU.readBigDecimal(in));
              break;

          default:
            if(!ignoreUnknown) throw new IllegalArgumentException("Unhandled field \"" + fldName + '\"');
        }
      }
    }
    return target;
  }

  public DmTesting read(final JsonParser in, boolean ignoreUnknown) throws IOException {
    return readInto(in, new DmTesting(), ignoreUnknown);
  }
}
