import javax.naming.Context;
import javax.naming.InitialContext;

import corbaBanque.Compte;
import corbaBanque.IBanqueRemote;
import corbaBanque.IBanqueRemoteHelper;


public class ClientCorba {
	public static void main(String[] args){
		try {
			Context ctx=new InitialContext();
			Object ref=ctx.lookup("BK");
			IBanqueRemote stub=IBanqueRemoteHelper.narrow((org.omg.CORBA.Object)ref);
			System.out.println(stub.conversion(600));
			Compte cp=stub.getCompte(4);

			System.out.println("solde ="+cp.solde);

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
