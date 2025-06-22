/*****************************************************
 * jr generated file
 ****************************************************/
import edu.ucdavis.jr.*;
import edu.ucdavis.jr.jrx.*;
import java.rmi.*;
import java.io.Serializable;

    public class JREstacionamiento
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

	public Cap_ext_ op_Auto_intTovoid;
	public Cap_ext_ JRget_op_Auto_intTovoid() {
		return op_Auto_intTovoid;
	}
	public void JRset_op_Auto_intTovoid(Cap_ext_ op_Auto_intTovoid) {
		this.op_Auto_intTovoid = op_Auto_intTovoid;
	}

	public Cap_ext_ op_esperaIngreso_intTovoid;
	public Cap_ext_ JRget_op_esperaIngreso_intTovoid() {
		return op_esperaIngreso_intTovoid;
	}
	public void JRset_op_esperaIngreso_intTovoid(Cap_ext_ op_esperaIngreso_intTovoid) {
		this.op_esperaIngreso_intTovoid = op_esperaIngreso_intTovoid;
	}

	public Cap_ext_ op_plantaAlta_intTovoid;
	public Cap_ext_ JRget_op_plantaAlta_intTovoid() {
		return op_plantaAlta_intTovoid;
	}
	public void JRset_op_plantaAlta_intTovoid(Cap_ext_ op_plantaAlta_intTovoid) {
		this.op_plantaAlta_intTovoid = op_plantaAlta_intTovoid;
	}

	public Cap_ext_ op_plantaBaja_intTovoid;
	public Cap_ext_ JRget_op_plantaBaja_intTovoid() {
		return op_plantaBaja_intTovoid;
	}
	public void JRset_op_plantaBaja_intTovoid(Cap_ext_ op_plantaBaja_intTovoid) {
		this.op_plantaBaja_intTovoid = op_plantaBaja_intTovoid;
	}

	public Cap_ext_ op_puerta_intTovoid;
	public Cap_ext_ JRget_op_puerta_intTovoid() {
		return op_puerta_intTovoid;
	}
	public void JRset_op_puerta_intTovoid(Cap_ext_ op_puerta_intTovoid) {
		this.op_puerta_intTovoid = op_puerta_intTovoid;
	}

	public Cap_ext_ op_mutex_intTovoid;
	public Cap_ext_ JRget_op_mutex_intTovoid() {
		return op_mutex_intTovoid;
	}
	public void JRset_op_mutex_intTovoid(Cap_ext_ op_mutex_intTovoid) {
		this.op_mutex_intTovoid = op_mutex_intTovoid;
	}

	public JREstacionamiento(JREstacionamiento copy)
	{
	this.op_pausa_intTovoid = copy.op_pausa_intTovoid;
	this.op_Auto_intTovoid = copy.op_Auto_intTovoid;
	this.op_esperaIngreso_intTovoid = copy.op_esperaIngreso_intTovoid;
	this.op_plantaAlta_intTovoid = copy.op_plantaAlta_intTovoid;
	this.op_plantaBaja_intTovoid = copy.op_plantaBaja_intTovoid;
	this.op_puerta_intTovoid = copy.op_puerta_intTovoid;
	this.op_mutex_intTovoid = copy.op_mutex_intTovoid;

	}
	public JREstacionamiento(Object ... opSig)
	{
	this.op_pausa_intTovoid = new Cap_ext_((Op_ext_.JRProxyOp)opSig[0]);
	this.op_Auto_intTovoid = new Cap_ext_((Op_ext_.JRProxyOp)opSig[1]);
	this.op_esperaIngreso_intTovoid = new Cap_ext_((Op_ext_.JRProxyOp)opSig[2]);
	this.op_plantaAlta_intTovoid = new Cap_ext_((Op_ext_.JRProxyOp)opSig[3]);
	this.op_plantaBaja_intTovoid = new Cap_ext_((Op_ext_.JRProxyOp)opSig[4]);
	this.op_puerta_intTovoid = new Cap_ext_((Op_ext_.JRProxyOp)opSig[5]);
	this.op_mutex_intTovoid = new Cap_ext_((Op_ext_.JRProxyOp)opSig[6]);

	}
	public JREstacionamiento(boolean dummy)	{
	    super(dummy);
	this.op_pausa_intTovoid = Cap_ext_.noop;
	this.op_Auto_intTovoid = Cap_ext_.noop;
	this.op_esperaIngreso_intTovoid = Cap_ext_.noop;
	this.op_plantaAlta_intTovoid = Cap_ext_.noop;
	this.op_plantaBaja_intTovoid = Cap_ext_.noop;
	this.op_puerta_intTovoid = Cap_ext_.noop;
	this.op_mutex_intTovoid = Cap_ext_.noop;

	}
	public Object clone()
	    throws CloneNotSupportedException
	{
	    return super.clone();
	}
	public static Object getNoop()
	{
	    return new JREstacionamiento(true);
	}
    }
