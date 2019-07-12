import java.util.*;
//NumsNull:import//

// <nums>:NumsNull ::= 
public class NumsNull extends Nums {



    public NumsNull() {

    }

    public static NumsNull parse(Scan scn$, Trace trace$) {
        if (trace$ != null)
            trace$ = trace$.nonterm("<nums>:NumsNull", scn$.lno);
        return new NumsNull();
    }


	// toString semantics for a NumsNull object
	public String toString() {
		return null;
	}


}
