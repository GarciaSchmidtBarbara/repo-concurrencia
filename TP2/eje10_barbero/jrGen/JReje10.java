/*****************************************************
 * jr generated file
 ****************************************************/
import edu.ucdavis.jr.*;
import edu.ucdavis.jr.jrx.*;
import java.rmi.*;
import java.io.Serializable;

    public class JReje10
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

	public Cap_ext_ op_cortarPelo_intTovoid;
	public Cap_ext_ JRget_op_cortarPelo_intTovoid() {
		return op_cortarPelo_intTovoid;
	}
	public void JRset_op_cortarPelo_intTovoid(Cap_ext_ op_cortarPelo_intTovoid) {
		this.op_cortarPelo_intTovoid = op_cortarPelo_intTovoid;
	}

	public Cap_ext_ op_sillon_voidTovoid;
	public Cap_ext_ JRget_op_sillon_voidTovoid() {
		return op_sillon_voidTovoid;
	}
	public void JRset_op_sillon_voidTovoid(Cap_ext_ op_sillon_voidTovoid) {
		this.op_sillon_voidTovoid = op_sillon_voidTovoid;
	}

	public Cap_ext_ op_puedoEsperar_voidTovoid;
	public Cap_ext_ JRget_op_puedoEsperar_voidTovoid() {
		return op_puedoEsperar_voidTovoid;
	}
	public void JRset_op_puedoEsperar_voidTovoid(Cap_ext_ op_puedoEsperar_voidTovoid) {
		this.op_puedoEsperar_voidTovoid = op_puedoEsperar_voidTovoid;
	}

	public Cap_ext_ op_mutexC_voidTovoid;
	public Cap_ext_ JRget_op_mutexC_voidTovoid() {
		return op_mutexC_voidTovoid;
	}
	public void JRset_op_mutexC_voidTovoid(Cap_ext_ op_mutexC_voidTovoid) {
		this.op_mutexC_voidTovoid = op_mutexC_voidTovoid;
	}

	public JReje10(JReje10 copy)
	{
	this.op_done_voidTovoid = copy.op_done_voidTovoid;
	this.op_Cliente_intTovoid = copy.op_Cliente_intTovoid;
	this.op_Barbero_voidTovoid = copy.op_Barbero_voidTovoid;
	this.op_cortarPelo_intTovoid = copy.op_cortarPelo_intTovoid;
	this.op_sillon_voidTovoid = copy.op_sillon_voidTovoid;
	this.op_puedoEsperar_voidTovoid = copy.op_puedoEsperar_voidTovoid;
	this.op_mutexC_voidTovoid = copy.op_mutexC_voidTovoid;

	}
	public JReje10(Object ... opSig)
	{
	this.op_done_voidTovoid = new Cap_ext_((Op_ext_.JRProxyOp)opSig[0]);
	this.op_Cliente_intTovoid = new Cap_ext_((Op_ext_.JRProxyOp)opSig[1]);
	this.op_Barbero_voidTovoid = new Cap_ext_((Op_ext_.JRProxyOp)opSig[2]);
	this.op_cortarPelo_intTovoid = new Cap_ext_((Op_ext_.JRProxyOp)opSig[3]);
	this.op_sillon_voidTovoid = new Cap_ext_((Op_ext_.JRProxyOp)opSig[4]);
	this.op_puedoEsperar_voidTovoid = new Cap_ext_((Op_ext_.JRProxyOp)opSig[5]);
	this.op_mutexC_voidTovoid = new Cap_ext_((Op_ext_.JRProxyOp)opSig[6]);

	}
	public JReje10(boolean dummy)	{
	    super(dummy);
	this.op_done_voidTovoid = Cap_ext_.noop;
	this.op_Cliente_intTovoid = Cap_ext_.noop;
	this.op_Barbero_voidTovoid = Cap_ext_.noop;
	this.op_cortarPelo_intTovoid = Cap_ext_.noop;
	this.op_sillon_voidTovoid = Cap_ext_.noop;
	this.op_puedoEsperar_voidTovoid = Cap_ext_.noop;
	this.op_mutexC_voidTovoid = Cap_ext_.noop;

	}
	public Object clone()
	    throws CloneNotSupportedException
	{
	    return super.clone();
	}
	public static Object getNoop()
	{
	    return new JReje10(true);
	}
    }
