package scripts.dataext.initdataext.testmaterial.multiservices.n1;

import scripts.dataext.initdataext.testmaterial.Context;
import scripts.dataext.initdataext.testmaterial.multiservices.MultiService1;

/**
 * @author fanshen
 * @since 2017/12/15
 */
public class MultiService1N1Provider implements MultiService1 {
    @Override
    public Void apply(Context context) {
        DataExtN1 dataExt = context.getDataExt();
        dataExt.setI(dataExt.getI() + 1);
        return null;
    }
}
