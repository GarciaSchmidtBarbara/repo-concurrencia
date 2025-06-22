/*****************************************************
 * jr generated file
 ****************************************************/
import edu.ucdavis.jr.*;
import edu.ucdavis.jr.jrx.*;
import java.rmi.*;
import java.io.Serializable;

    public class JRLectoresEscritores
      extends JRjavadotlangdotObject
      implements Serializable, Cloneable
    {
	static final long serialVersionUID = 0;
	public Cap_ext_ op_pausa_intTovoid;
	public Cap_ext_ JRget_op_pausa_intTovoid() {
		return op_pausa_intTovoid;
	}
	public void JRset_op_pausa_intTovoid(Cap_ext_ op_pausa_intTovoid) {
		this.op_pausa_intTovoid = op_pausa_intTovoid;
	}

	public Cap_ext_ op_Lector_intTovoid;
	public Cap_ext_ JRget_op_Lector_intTovoid() {
		return op_Lector_intTovoid;
	}
	public void JRset_op_Lector_intTovoid(Cap_ext_ op_Lector_intTovoid) {
		this.op_Lector_intTovoid = op_Lector_intTovoid;
	}

	public Cap_ext_ op_Escritor_intTovoid;
	public Cap_ext_ JRget_op_Escritor_intTovoid() {
		return op_Escritor_intTovoid;
	}
	public void JRset_op_Escritor_intTovoid(Cap_ext_ op_Escritor_intTovoid) {
		this.op_Escritor_intTovoid = op_Escritor_intTovoid;
	}

	public Cap_ext_ op_mutex_javadotlangdotStringTovoid;
	public Cap_ext_ JRget_op_mutex_javadotlangdotStringTovoid() {
		return op_mutex_javadotlangdotStringTovoid;
	}
	public void JRset_op_mutex_javadotlangdotStringTovoid(Cap_ext_ op_mutex_javadotlangdotStringTovoid) {
		this.op_mutex_javadotlangdotStringTovoid = op_mutex_javadotlangdotStringTovoid;
	}

	public Cap_ext_ op_mnjLectorEscritor_javadotlangdotStringTovoid;
	public Cap_ext_ JRget_op_mnjLectorEscritor_javadotlangdotStringTovoid() {
		return op_mnjLectorEscritor_javadotlangdotStringTovoid;
	}
	public void JRset_op_mnjLectorEscritor_javadotlangdotStringTovoid(Cap_ext_ op_mnjLectorEscritor_javadotlangdotStringTovoid) {
		this.op_mnjLectorEscritor_javadotlangdotStringTovoid = op_mnjLectorEscritor_javadotlangdotStringTovoid;
	}

	public JRLectoresEscritores(JRLectoresEscritores copy)
	{
	this.op_pausa_intTovoid = copy.op_pausa_intTovoid;
	this.op_Lector_intTovoid = copy.op_Lector_intTovoid;
	this.op_Escritor_intTovoid = copy.op_Escritor_intTovoid;
	this.op_mutex_javadotlangdotStringTovoid = copy.op_mutex_javadotlangdotStringTovoid;
	this.op_mnjLectorEscritor_javadotlangdotStringTovoid = copy.op_mnjLectorEscritor_javadotlangdotStringTovoid;

	}
	public JRLectoresEscritores(Object ... opSig)
	{
	this.op_pausa_intTovoid = new Cap_ext_((Op_ext_.JRProxyOp)opSig[0]);
	this.op_Lector_intTovoid = new Cap_ext_((Op_ext_.JRProxyOp)opSig[1]);
	this.op_Escritor_intTovoid = new Cap_ext_((Op_ext_.JRProxyOp)opSig[2]);
	this.op_mutex_javadotlangdotStringTovoid = new Cap_ext_((Op_ext_.JRProxyOp)opSig[3]);
	this.op_mnjLectorEscritor_javadotlangdotStringTovoid = new Cap_ext_((Op_ext_.JRProxyOp)opSig[4]);

	}
	public JRLectoresEscritores(boolean dummy)	{
	    super(dummy);
	this.op_pausa_intTovoid = Cap_ext_.noop;
	this.op_Lector_intTovoid = Cap_ext_.noop;
	this.op_Escritor_intTovoid = Cap_ext_.noop;
	this.op_mutex_javadotlangdotStringTovoid = Cap_ext_.noop;
	this.op_mnjLectorEscritor_javadotlangdotStringTovoid = Cap_ext_.noop;

	}
	public Object clone()
	    throws CloneNotSupportedException
	{
	    return super.clone();
	}
	public static Object getNoop()
	{
	    return new JRLectoresEscritores(true);
	}
    }
