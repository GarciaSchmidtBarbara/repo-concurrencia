/*****************************************************
 * jr generated file
 ****************************************************/
import edu.ucdavis.jr.*;
import edu.ucdavis.jr.jrx.*;
import java.rmi.*;
import java.io.Serializable;

    public class JReje8
      extends JRjavadotlangdotObject
      implements Serializable, Cloneable
    {
	static final long serialVersionUID = 0;
	public Cap_ext_ op_done_voidTovoid;
	public Cap_ext_ JRget_op_done_voidTovoid() {
		return op_done_voidTovoid;
	}
	public void JRset_op_done_voidTovoid(Cap_ext_ op_done_voidTovoid) {
		this.op_done_voidTovoid = op_done_voidTovoid;
	}

	public Cap_ext_ op_Lectores_intTovoid;
	public Cap_ext_ JRget_op_Lectores_intTovoid() {
		return op_Lectores_intTovoid;
	}
	public void JRset_op_Lectores_intTovoid(Cap_ext_ op_Lectores_intTovoid) {
		this.op_Lectores_intTovoid = op_Lectores_intTovoid;
	}

	public Cap_ext_ op_Escritores_intTovoid;
	public Cap_ext_ JRget_op_Escritores_intTovoid() {
		return op_Escritores_intTovoid;
	}
	public void JRset_op_Escritores_intTovoid(Cap_ext_ op_Escritores_intTovoid) {
		this.op_Escritores_intTovoid = op_Escritores_intTovoid;
	}

	public Cap_ext_ op_pausa_intTovoid;
	public Cap_ext_ JRget_op_pausa_intTovoid() {
		return op_pausa_intTovoid;
	}
	public void JRset_op_pausa_intTovoid(Cap_ext_ op_pausa_intTovoid) {
		this.op_pausa_intTovoid = op_pausa_intTovoid;
	}

	public Cap_ext_ op_mutexE_voidTovoid;
	public Cap_ext_ JRget_op_mutexE_voidTovoid() {
		return op_mutexE_voidTovoid;
	}
	public void JRset_op_mutexE_voidTovoid(Cap_ext_ op_mutexE_voidTovoid) {
		this.op_mutexE_voidTovoid = op_mutexE_voidTovoid;
	}

	public Cap_ext_ op_puedoEscribir_voidTovoid;
	public Cap_ext_ JRget_op_puedoEscribir_voidTovoid() {
		return op_puedoEscribir_voidTovoid;
	}
	public void JRset_op_puedoEscribir_voidTovoid(Cap_ext_ op_puedoEscribir_voidTovoid) {
		this.op_puedoEscribir_voidTovoid = op_puedoEscribir_voidTovoid;
	}

	public Cap_ext_ op_puedoLeer_voidTovoid;
	public Cap_ext_ JRget_op_puedoLeer_voidTovoid() {
		return op_puedoLeer_voidTovoid;
	}
	public void JRset_op_puedoLeer_voidTovoid(Cap_ext_ op_puedoLeer_voidTovoid) {
		this.op_puedoLeer_voidTovoid = op_puedoLeer_voidTovoid;
	}

	public JReje8(JReje8 copy)
	{
	this.op_done_voidTovoid = copy.op_done_voidTovoid;
	this.op_Lectores_intTovoid = copy.op_Lectores_intTovoid;
	this.op_Escritores_intTovoid = copy.op_Escritores_intTovoid;
	this.op_pausa_intTovoid = copy.op_pausa_intTovoid;
	this.op_mutexE_voidTovoid = copy.op_mutexE_voidTovoid;
	this.op_puedoEscribir_voidTovoid = copy.op_puedoEscribir_voidTovoid;
	this.op_puedoLeer_voidTovoid = copy.op_puedoLeer_voidTovoid;

	}
	public JReje8(Object ... opSig)
	{
	this.op_done_voidTovoid = new Cap_ext_((Op_ext_.JRProxyOp)opSig[0]);
	this.op_Lectores_intTovoid = new Cap_ext_((Op_ext_.JRProxyOp)opSig[1]);
	this.op_Escritores_intTovoid = new Cap_ext_((Op_ext_.JRProxyOp)opSig[2]);
	this.op_pausa_intTovoid = new Cap_ext_((Op_ext_.JRProxyOp)opSig[3]);
	this.op_mutexE_voidTovoid = new Cap_ext_((Op_ext_.JRProxyOp)opSig[4]);
	this.op_puedoEscribir_voidTovoid = new Cap_ext_((Op_ext_.JRProxyOp)opSig[5]);
	this.op_puedoLeer_voidTovoid = new Cap_ext_((Op_ext_.JRProxyOp)opSig[6]);

	}
	public JReje8(boolean dummy)	{
	    super(dummy);
	this.op_done_voidTovoid = Cap_ext_.noop;
	this.op_Lectores_intTovoid = Cap_ext_.noop;
	this.op_Escritores_intTovoid = Cap_ext_.noop;
	this.op_pausa_intTovoid = Cap_ext_.noop;
	this.op_mutexE_voidTovoid = Cap_ext_.noop;
	this.op_puedoEscribir_voidTovoid = Cap_ext_.noop;
	this.op_puedoLeer_voidTovoid = Cap_ext_.noop;

	}
	public Object clone()
	    throws CloneNotSupportedException
	{
	    return super.clone();
	}
	public static Object getNoop()
	{
	    return new JReje8(true);
	}
    }
