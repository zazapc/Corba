package service;

import corbaBanque.Compte;
import corbaBanque.IBanqueRemotePOA;

public class BanqueImpl extends IBanqueRemotePOA {

	@Override
	public double conversion(double mt) {
		// TODO Auto-generated method stub
		return mt*11;
	}

	@Override
	public Compte getCompte(int code) {
		// TODO Auto-generated method stub
		return new Compte(code, (float)Math.random()*4000);
	}

	@Override
	public Compte[] getComptes() {
		Compte[] cptes=new Compte[3];
		for(int i=0;i<cptes.length;i++){
			cptes[i]=new Compte(i, (float)Math.random()*4000);
		}
		return cptes;
	}

}
