import java.util.*;
//Lon:import//

// <lon> ::= <nums> ATSIGN
public class Lon {

    public Nums nums;

    public Lon() { } // dummy constructor

    public Lon(Nums nums) {
        this.nums = nums;
    }

    public static Lon parse(Scan scn$, Trace trace$) {
        if (trace$ != null)
            trace$ = trace$.nonterm("<lon>", scn$.lno);
        Nums nums = Nums.parse(scn$, trace$);
        scn$.match(Token.Val.ATSIGN, trace$);
        return new Lon(nums);
    }


    // toString semantics for a Lon object
    public String toString() {
		return "( " + nums.toString() + ")";
	}

}
