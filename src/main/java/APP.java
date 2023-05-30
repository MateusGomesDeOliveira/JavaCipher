import static Controller.Cipher.decrypt;
import static Controller.Cipher.encrypt;

public class APP {
    public static void main(String[] args) {
        encrypt("""
                Hello there general kenobi our mission is to infiltrate
                into general griveous hideout on 15 of march
                please burn this message after solving it
                may the force be with you
                """);
        decrypt("""
                80yyit80x0n0r0xqys0rivhiwxlhaahirhatihrghytxqt0
                hrtin0r0xqynxhm0iwa8h90iwtir1figlqxd8
                4y0qa0vwxrt8hal0aaqn0qgt0xaiymhrnht
                lqjt80gixd0v0uht8jiw
                """);
    }
}