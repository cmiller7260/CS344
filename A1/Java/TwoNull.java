import java.util.*;
//TwoNull:import//

// <two>:TwoNull ::= 
public class TwoNull extends Two {



    public TwoNull() {

    }

    public static TwoNull parse(Scan scn$, Trace trace$) {
        if (trace$ != null)
            trace$ = trace$.nonterm("<two>:TwoNull", scn$.lno);
        return new TwoNull();
    }

//TwoNull//

}
