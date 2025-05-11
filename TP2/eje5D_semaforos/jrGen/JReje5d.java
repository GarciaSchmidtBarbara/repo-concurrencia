/*****************************************************
 * jr generated file
 ****************************************************/
import edu.ucdavis.jr.*;
import edu.ucdavis.jr.jrx.*;
import java.rmi.*;
import java.io.Serializable;

    public class JReje5d
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

	public Cap_ext_ op_PConsumer_voidTovoid;
	public Cap_ext_ JRget_op_PConsumer_voidTovoid() {
		return op_PConsumer_voidTovoid;
	}
	public void JRset_op_PConsumer_voidTovoid(Cap_ext_ op_PConsumer_voidTovoid) {
		this.op_PConsumer_voidTovoid = op_PConsumer_voidTovoid;
	}

	public Cap_ext_ op_PProducer_voidTovoid;
	public Cap_ext_ JRget_op_PProducer_voidTovoid() {
		return op_PProducer_voidTovoid;
	}
	public void JRset_op_PProducer_voidTovoid(Cap_ext_ op_PProducer_voidTovoid) {
		this.op_PProducer_voidTovoid = op_PProducer_voidTovoid;
	}

	public Cap_ext_ op_pausa_intTovoid;
	public Cap_ext_ JRget_op_pausa_intTovoid() {
		return op_pausa_intTovoid;
	}
	public void JRset_op_pausa_intTovoid(Cap_ext_ op_pausa_intTovoid) {
		this.op_pausa_intTovoid = op_pausa_intTovoid;
	}

	public Cap_ext_ op_puedoConsumir_voidTovoid;
	public Cap_ext_ JRget_op_puedoConsumir_voidTovoid() {
		return op_puedoConsumir_voidTovoid;
	}
	public void JRset_op_puedoConsumir_voidTovoid(Cap_ext_ op_puedoConsumir_voidTovoid) {
		this.op_puedoConsumir_voidTovoid = op_puedoConsumir_voidTovoid;
	}

	public JReje5d(JReje5d copy)
	{
	this.op_done_voidTovoid = copy.op_done_voidTovoid;
	this.op_PConsumer_voidTovoid = copy.op_PConsumer_voidTovoid;
	this.op_PProducer_voidTovoid = copy.op_PProducer_voidTovoid;
	this.op_pausa_intTovoid = copy.op_pausa_intTovoid;
	this.op_puedoConsumir_voidTovoid = copy.op_puedoConsumir_voidTovoid;

	}
	public JReje5d(Object ... opSig)
	{
	this.op_done_voidTovoid = new Cap_ext_((Op_ext_.JRProxyOp)opSig[0]);
	this.op_PConsumer_voidTovoid = new Cap_ext_((Op_ext_.JRProxyOp)opSig[1]);
	this.op_PProducer_voidTovoid = new Cap_ext_((Op_ext_.JRProxyOp)opSig[2]);
	this.op_pausa_intTovoid = new Cap_ext_((Op_ext_.JRProxyOp)opSig[3]);
	this.op_puedoConsumir_voidTovoid = new Cap_ext_((Op_ext_.JRProxyOp)opSig[4]);

	}
	public JReje5d(boolean dummy)	{
	    super(dummy);
	this.op_done_voidTovoid = Cap_ext_.noop;
	this.op_PConsumer_voidTovoid = Cap_ext_.noop;
	this.op_PProducer_voidTovoid = Cap_ext_.noop;
	this.op_pausa_intTovoid = Cap_ext_.noop;
	this.op_puedoConsumir_voidTovoid = Cap_ext_.noop;

	}
	public Object clone()
	    throws CloneNotSupportedException
	{
	    return super.clone();
	}
	public static Object getNoop()
	{
	    return new JReje5d(true);
	}
    }
