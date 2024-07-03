package model;

public class MovimientoCuenta {
	String origenMovimiento;
	Boolean aumenta;
	double monto;
	
	public String getOrigenMovimiento() {
		return origenMovimiento;
	}
	public void setOrigenMovimiento(String origenMovimiento) {
		this.origenMovimiento = origenMovimiento;
	}
	public Boolean getAumenta() {
		return aumenta;
	}
	public void setAumenta(Boolean aumenta) {
		this.aumenta = aumenta;
	}
	public double getMonto() {
		return monto;
	}
	public void setMonto(double monto) {
		this.monto = monto;
	}
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("MovimientoCuenta [origenMovimiento=").append(origenMovimiento).append(", aumenta=")
				.append(aumenta).append(", monto=").append(monto).append("]");
		return builder.toString();
	}
	
	@Override
	public boolean equals(Object obj) {
		MovimientoCuenta movimientoCuenta = (MovimientoCuenta)obj;
		if(movimientoCuenta.getAumenta()==this.getAumenta()
				&& movimientoCuenta.getMonto() == this.getMonto()
				&& this.getOrigenMovimiento().equals(movimientoCuenta.getOrigenMovimiento())){
			return true;
		}else {
			return false;
		}
	}
	
	
}
