package abel.almademerry.maven.CalculadoraDeNota_asotillos;
public class CalculaNota {
	static public void Comprobar(String[] args)
	{
	 Boolean A=false, T=false, N=false, ex1=false, pr1=false, comp = null ;
	 double notas []= new double [args.length];
	 char nombre[]=new char [args.length];
	 for (int i = 0; i < args.length; i++) {
		comp=args[i].matches("[ATCP]-[0-9]{0,2}(\\.[0-9]{1,2})?%?$|^-?(100)(\\.[0]{1,2})");
		if(!comp) {
			comp=false;
			 break;
		}
	}
	 if(args.length > 20) {
		 System.out.println("Error Muchas notas");
	 }else if(!comp){
		 System.out.println("Error Mal formato de expresión");
	 }else {
		 for (int i = 0; i < args.length; i++) {
			 String[] parts = args[i].split("-");
			 notas[i]=Double.parseDouble(parts[1]);
			 nombre[i]= parts[0].charAt(0);
			 if(nombre[i]=='A') {
				 A=true;
			 }
			 if(nombre[i]=='T') {
				 T=true;
			 }
			 if(nombre[i]=='C' && notas[i] > 10 || nombre[i]=='P'&& notas[i] > 10) {
				 N=true;
			 }
			 if(nombre[i]=='A' && notas[i] > 1 || nombre[i]=='T'&& notas[i] > 1) {
				 N=true;
			 }
			 if(nombre[i]=='C') {
				 ex1=true;
			 }
			 if(nombre[i]=='P') {
				 pr1=true;
			 }
		}

		 if(!A) {
			 System.out.println("Falta Asistencia");
			 
		 }else if(!T) {
			 System.out.println("Falta Actitud");
		 }else if(N) {
			 System.out.println("Error en nota"); 
		 }
		 else if(!pr1) {
			 System.out.println("Falta Practica");
		 }
		 else if(!ex1) {
			 System.out.println("Falta Examen");
		 }else {
			 if(Calcular(notas,nombre)==10){
				 System.out.println("MH");
			 }else {
				 System.out.println(Calcular(notas,nombre));
			 }
		 }
	 }
	}
	static public double Calcular(double[] nota,char[]nombre) {
	double examenes=0, practicas=0, A=0,T=0,contex=0,contpr=0;
		for (int i = 0; i < nombre.length; i++) {
			switch (nombre[i]) {
				case 'A':
					A=nota[i];
					break;
				case 'T':
					T=nota[i];
					break;
				case 'C':
					if(nota[i]<3) {
						return 0;
					}
					examenes=examenes+nota[i];
					contex++;
					break;
				case 'P':
					if(nota[i]<5) {
						return 0;
					}
					practicas=practicas+nota[i];
					contpr++;
					break;
			}
			
		}
		examenes=examenes/contex;
		practicas=practicas/contpr;
		if((examenes+practicas)/2*0.8<4) {
			return (((examenes+practicas)/2)*0.8);
		}else {
			return ((((examenes+practicas)/2)*0.8)+A+T);
		}
	}
}
