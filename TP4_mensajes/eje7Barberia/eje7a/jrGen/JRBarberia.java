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

	public Cap_ext_ op_Barbero_voidTovoid;
	public Cap_ext_ JRget_op_Barbero_voidTovoid() {
		return op_Barbero_voidTovoid;
	}
	public void JRset_op_Barbero_voidTovoid(Cap_ext_ op_Barbero_voidTovoid) {
		this.op_Barbero_voidTovoid = op_Barbero_voidTovoid;
	}

	public Cap_ext_ op_puedoEsperar_javadotlangdotStringTovoid;
	public Cap_ext_ JRget_op_puedoEsperar_javadotlangdotStringTovoid() {
		return op_puedoEsperar_javadotlangdotStringTovoid;
	}
	public void JRset_op_puedoEsperar_javadotlangdotStringTovoid(Cap_ext_ op_puedoEsperar_javadotlangdotStringTovoid) {
		this.op_puedoEsperar_javadotlangdotStringTovoid = op_puedoEsperar_javadotlangdotStringTovoid;
	}

	public Cap_ext_ op_cliente_javadotlangdotStringTovoid;
	public Cap_ext_ JRget_op_cliente_javadotlangdotStringTovoid() {
		return op_cliente_javadotlangdotStringTovoid;
	}
	public void JRset_op_cliente_javadotlangdotStringTovoid(Cap_ext_ op_cliente_javadotlangdotStringTovoid) {
		this.op_cliente_javadotlangdotStringTovoid = op_cliente_javadotlangdotStringTovoid;
	}

	public Cap_ext_ op_barbero_javadotlangdotStringTovoid;
	public Cap_ext_ JRget_op_barbero_javadotlangdotStringTovoid() {
		return op_barbero_javadotlangdotStringTovoid;
	}
	public void JRset_op_barbero_javadotlangdotStringTovoid(Cap_ext_ op_barbero_javadotlangdotStringTovoid) {
		this.op_barbero_javadotlangdotStringTovoid = op_barbero_javadotlangdotStringTovoid;
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
	this.op_Barbero_voidTovoid = copy.op_Barbero_voidTovoid;
	this.op_puedoEsperar_javadotlangdotStringTovoid = copy.op_puedoEsperar_javadotlangdotStringTovoid;
	this.op_cliente_javadotlangdotStringTovoid = copy.op_cliente_javadotlangdotStringTovoid;
	this.op_barbero_javadotlangdotStringTovoid = copy.op_barbero_javadotlangdotStringTovoid;
	this.op_mutex_javadotlangdotStringTovoid = copy.op_mutex_javadotlangdotStringTovoid;

	}
	public JRBarberia(Object ... opSig)
	{
	this.op_pausa_intTovoid = new Cap_ext_((Op_ext_.JRProxyOp)opSig[0]);
	this.op_Cliente_intTovoid = new Cap_ext_((Op_ext_.JRProxyOp)opSig[1]);
	this.op_Barbero_voidTovoid = new Cap_ext_((Op_ext_.JRProxyOp)opSig[2]);
	this.op_puedoEsperar_javadotlangdotStringTovoid = new Cap_ext_((Op_ext_.JRProxyOp)opSig[3]);
	this.op_cliente_javadotlangdotStringTovoid = new Cap_ext_((Op_ext_.JRProxyOp)opSig[4]);
	this.op_barbero_javadotlangdotStringTovoid = new Cap_ext_((Op_ext_.JRProxyOp)opSig[5]);
	this.op_mutex_javadotlangdotStringTovoid = new Cap_ext_((Op_ext_.JRProxyOp)opSig[6]);

	}
	public JRBarberia(boolean dummy)	{
	    super(dummy);
	this.op_pausa_intTovoid = Cap_ext_.noop;
	this.op_Cliente_intTovoid = Cap_ext_.noop;
	this.op_Barbero_voidTovoid = Cap_ext_.noop;
	this.op_puedoEsperar_javadotlangdotStringTovoid = Cap_ext_.noop;
	this.op_cliente_javadotlangdotStringTovoid = Cap_ext_.noop;
	this.op_barbero_javadotlangdotStringTovoid = Cap_ext_.noop;
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
