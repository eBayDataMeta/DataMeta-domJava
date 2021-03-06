package test.ebay.datameta.ser.jackson.fasterxml.gen.v3_2_14;




import org.ebay.datameta.dom.DataMetaSame;
import org.ebay.datameta.util.jdk.SemanticVersion;

/**

 * This class is generated by
 * <a href='https://github.com/eBayDataMeta/DataMeta'>DataMeta</a>.
 */
public class TestingDm_DmSameId implements DataMetaSame<TestingDm>{
    /**
    * Convenience instance.
    */
    public final static TestingDm_DmSameId I = new TestingDm_DmSameId();
    @Override public boolean isSame(final TestingDm one, final TestingDm another) {
        if(one == another) return true; // same object or both are null
        //noinspection SimplifiableIfStatement
        if(one == null || another == null) return false; // whichever of them is null but the other is not
        
        return EQ.isSame(one.getId(), another.getId());
    }
    public static final SemanticVersion VERSION = SemanticVersion.parse("3.2.14");
}
