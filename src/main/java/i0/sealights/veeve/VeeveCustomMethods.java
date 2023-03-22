package i0.sealights.veeve;

import java.util.ArrayList;
import java.util.List;

public class VeeveCustomMethods {

    public int methodIncludeInt(int a) {
        return a;
    }

    public String methodIncludeString(String a) {
        return a;
    }

    public int methodIncludeDouble(double a) {
        return 1;
    }

    public int methodExcludeInt(int a) {
        return a;
    }

    public String methodExcludeString(String a) {
        return a;
    }

    public int methodExcludeDouble(double a) {
        return 1;
    }

    private List<String> convertResultSetToData2(List<String> a, List<String> b) {
        return new ArrayList<String >();
    }
}
