import java.util.*;
//Balanced:import//

// <balanced> ::= <two> ATSIGN
public class Balanced {

    public Two two;

    public Balanced() { } // dummy constructor

    public Balanced(Two two) {
        this.two = two;
    }

    public static Balanced parse(Scan scn$, Trace trace$) {
        if (trace$ != null)
            trace$ = trace$.nonterm("<balanced>", scn$.lno);
        Two two = Two.parse(scn$, trace$);
        scn$.match(Token.Val.ATSIGN, trace$);
        return new Balanced(two);
    }

//Balanced//

}
