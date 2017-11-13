package test.ebay.datameta.ser.jackson.fasterxml.gen.v3_2_14;

import java.time.ZonedDateTime;
import java.util.List;
import java.util.Set;


import org.ebay.datameta.dom.DataMetaSame;
import org.ebay.datameta.util.jdk.SemanticVersion;

/**

 * This class is generated by
 * <a href='https://github.com/eBayDataMeta/DataMeta'>DataMeta</a>.
 */
public class TestingDm_DmSameFull implements DataMetaSame<TestingDm>{
    /**
    * Convenience instance.
    */
    public final static TestingDm_DmSameFull I = new TestingDm_DmSameFull();
    @Override public boolean isSame(final TestingDm one, final TestingDm another) {
        if(one == another) return true; // same object or both are null
        //noinspection SimplifiableIfStatement
        if(one == null || another == null) return false; // whichever of them is null but the other is not
        
        final List<ZonedDateTime> whens___1__ = one.getWhens();
        final List<ZonedDateTime> whens___2__ = another.getWhens();
        if(whens___1__ != whens___2__ )  {
            if(whens___1__ == null || whens___2__ == null ) return false; // one of them is null but not both -- not equal short-circuit
            java.util.ListIterator<ZonedDateTime> whens___li1__ = whens___1__.listIterator();
            java.util.ListIterator<ZonedDateTime> whens___li2__ = whens___2__.listIterator();
            while(whens___li1__.hasNext() && whens___li2__.hasNext()) {
                final ZonedDateTime o1 = whens___li1__.next(), o2 = whens___li2__.next();
                if(!(o1 == null ? o2 == null : EQ.isSame(o1, o2))) return false; // shortcircuit to false
            }
            if(whens___li1__.hasNext() || whens___li2__.hasNext()) return false; // leftover elements in one
        }

        return EQ.isSame(one.getId(), another.getId()) && (one.getColor() == another.getColor()) && (one.getLongs() != null && one.getLongs().equals(another.getLongs()));
    }
    public static final SemanticVersion VERSION = SemanticVersion.parse("3.2.14");
}
