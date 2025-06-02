public class NeuroneReLu extends Neurone{

    //fonction d'activation d'un neurone pour ReLu
    protected float activation(final float valeur) {return valeur >= 0 ? valeur : 0.f;}

    // Constructeur
	public NeuroneReLu(final int nbEntrees) {super(nbEntrees);}
}