package blockly;

import cronapi.*;
import cronapi.rest.security.CronappSecurity;
import java.util.Iterator;
import java.util.concurrent.Callable;


@CronapiMetaData(type = "blockly")
@CronappSecurity
public class DisparoEmailSolicitacao {

public static final int TIMEOUT = 300;

/**
 *
 * @author Breno Albergaria Argolo
 * @since 21/10/2024, 10:23:36
 *
 */
public static Var disparoEmailSolicitacao() throws Exception {
 return new Callable<Var>() {

   private Var emailDoadores = Var.VAR_NULL;
   private Var i = Var.VAR_NULL;

   public Var call() throws Exception {
    emailDoadores =
    cronapi.database.Operations.query(Var.valueOf("app.entity.Doador"),Var.valueOf("select \n	d.email_doador \nfrom \n	Doador d"));
    System.out.println(emailDoadores.getObjectAsString());
    for (Iterator it_i = emailDoadores.iterator(); it_i.hasNext();) {
        i = Var.valueOf(it_i.next());
        cronapi.email.Operations.sendEmail(
        Var.valueOf("email@techne.com.br"), i,
        Var.valueOf(""),
        Var.valueOf(""),
        Var.valueOf(""),
        Var.valueOf(""),
        Var.valueOf(""),
        Var.valueOf(""),
        Var.valueOf("mailing.fieb.org.br"),
        Var.valueOf("25"),
        Var.valueOf(""),
        Var.valueOf(""),
        Var.valueOf("PLAIN"));
    } // end for
    return Var.VAR_NULL;
   }
 }.call();
}

}

