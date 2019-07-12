import java.util.*;
//Nums:import//

public abstract class Nums {

    public static Nums parse(Scan scn$, Trace trace$) {
        Token t$ = scn$.cur();
        Token.Val v$ = t$.val;
        switch(v$) {
        case LPAREN:
            return NumsNode.parse(scn$,trace$);
        case ATSIGN:
        case RPAREN:
            return NumsNull.parse(scn$,trace$);
        default:
            throw new RuntimeException("Nums cannot begin with " + v$);
        }
    }

//Nums//

}
