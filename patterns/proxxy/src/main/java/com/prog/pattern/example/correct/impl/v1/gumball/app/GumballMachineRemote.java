package com.prog.pattern.example.correct.impl.v1.gumball.app;

import com.prog.pattern.example.correct.impl.v1.gumball.app.state.State;

import java.rmi.Remote;
import java.rmi.RemoteException;
 
public interface GumballMachineRemote extends Remote {
	public int getQtyOfBalls() throws RemoteException;
	public String getLocation() throws RemoteException;
	public State getState() throws RemoteException;
}
