package Interfaces;

import java.util.List;

import model.TblAuto;

public interface IAutoable {
	
		//declaramos los metodos
		public void RegistrarAuto(TblAuto tblauto);
		public void ActualizarAuto(TblAuto tblauto);
		public void EliminarAuto(TblAuto tblauto);
		public TblAuto BuscarAuto(TblAuto tblauto);
		public List<TblAuto> Listado();
	}//find de a interface

