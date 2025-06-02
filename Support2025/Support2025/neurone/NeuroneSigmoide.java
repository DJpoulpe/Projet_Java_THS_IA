public class NeuroneSigmoide extends Neurone{


    protected float activation(final float valeur) {
        double val_double = valeur;
        float result = (float) Math.exp(-val_double);
        return (1/(1+ result));
    }


    // Constructeur
	public NeuroneSigmoide(final int nbEntrees) {super(nbEntrees);}
}
