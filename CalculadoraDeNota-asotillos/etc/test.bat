echo "Saca un 0 porque no llega a los mínimos"
java -jar CalculadoraDeNota-asotillos.jar C-5 C-9.5 C-4 P-2 P-10 C-8.22 A-1 P-5 T-0.5 P-5.55
echo "Falta actiud"
java -jar CalculadoraDeNota-asotillos.jar C-5 C-9.5 C-6 P-2 P-10 C-8.22 A-1 P-5 P-5.55 
echo "palta práctica"
java -jar CalculadoraDeNota-asotillos.jar C-5 C-9.5 C-6 C-8.22 A-1 T-0.5
echo "Mal formato de expresión"
java -jar CalculadoraDeNota-asotillos.jar C-5 C-9.5 C-6 C-8.22 A-1 T-0.5 45
echo "Falta Examen"
java -jar CalculadoraDeNota-asotillos.jar P-5 P-9.5 P-6 A-1 T-0.5 
echo "Cantidad excesiva de argumentos"
java -jar CalculadoraDeNota-asotillos.jar C-5 C-9.5 C-4 P-2 P-10 C-8.22 A-1 P-5 T-0.5 P-5.55 C-5 C-9.5 C-4 C-5 C-9.5 C-4 P-2 P-10 C-8.22 A-1 P-5 T-0.5 P-5.55 C-5 C-9.5 C-4
