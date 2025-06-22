/*****************************************************
 * jr generated file
 ****************************************************/
import edu.ucdavis.jr.*;
import edu.ucdavis.jr.jrx.*;
import java.rmi.*;
import java.io.Serializable;

    public class JRBarberia
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

	public Cap_ext_ op_Cliente_intTovoid;
	public Cap_ext_ JRget_op_Cliente_intTovoid() {
		return op_Cliente_intTovoid;
	}
	public void JRset_op_Cliente_intTovoid(Cap_ext_ op_Cliente_intTovoid) {
		this.op_Cliente_intTovoid = op_Cliente_intTovoid;
	}

	public Cap_ext_ op_Barbero_intTovoid;
	public Cap_ext_ JRget_op_Barbero_intTovoid() {
		return op_Barbero_intTovoid;
	}
	public void JRset_op_Barbero_intTovoid(Cap_ext_ op_Barbero_intTovoid) {
		this.op_Barbero_intTovoid = op_Barbero_intTovoid;
	}

	public Cap_ext_ op_puedoEsperar_intTovoid;
	public Cap_ext_ JRget_op_puedoEsperar_intTovoid() {
		return op_puedoEsperar_intTovoid;
	}
	public void JRset_op_puedoEsperar_intTovoid(Cap_ext_ op_puedoEsperar_intTovoid) {
		this.op_puedoEsperar_intTovoid = op_puedoEsperar_intTovoid;
	}

	public Cap_ext_ op_mutex_javadotlangdotStringTovoid;
	public Cap_ext_ JRget_op_mutex_javadotlangdotStringTovoid() {
		return op_mutex_javadotlangdotStringTovoid;
	}
	public void JRset_op_mutex_javadotlangdotStringTovoid(Cap_ext_ op_mutex_javadotlangdotStringTovoid) {
		this.op_mutex_javadotlangdotStringTovoid = op_mutex_javadotlangdotStringTovoid;
	}

	public JRBarberia(JRBarberia copy)
	{
	this.op_pausa_intTovoid = copy.op_pausa_intTovoid;
	this.op_Cliente_intTovoid = copy.op_Cliente_intTovoid;
	this.op_Barbero_intTovoid = copy.op_Barbero_intTovoid;
	this.op_puedoEsperar_intTovoid = copy.op_puedoEsperar_intTovoid;
	this.op_mutex_javadotlangdotStringTovoid = copy.op_mutex_javadotlangdotStringTovoid;

	}
	public JRBarberia(Object ... opSig)
	{
	this.op_pausa_intTovoid = new Cap_ext_((Op_ext_.JRProxyOp)opSig[0]);
	this.op_Cliente_intTovoid = new Cap_ext_((Op_ext_.JRProxyOp)opSig[1]);
	this.op_Barbero_intTovoid = new Cap_ext_((Op_ext_.JRProxyOp)opSig[2]);
	this.op_puedoEsperar_intTovoid = new Cap_ext_((Op_ext_.JRProxyOp)opSig[3]);
	this.op_mutex_javadotlangdotStringTovoid = new Cap_ext_((Op_ext_.JRProxyOp)opSig[4]);

	}
	public JRBarberia(boolean dummy)	{
	    super(dummy);
	this.op_pausa_intTovoid = Cap_ext_.noop;
	this.op_Cliente_intTovoid = Cap_ext_.noop;
	this.op_Barbero_intTovoid = Cap_ext_.noop;
	this.op_puedoEsperar_intTovoid = Cap_ext_.noop;
	this.op_mutex_javadotlangdotStringTovoid = Cap_ext_.noop;

	}
	public Object clone()
	    throws CloneNotSupportedException
	{
	    return super.clone();
	}
	public static Object getNoop()
	{
	    return new JRBarberia(true);
	}
    }
