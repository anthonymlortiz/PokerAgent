/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pokerAgent;

/**
 * Contains move type and node ID of an attacker action
 * 
 * @author Marcus Gutierrez
 */
public class Action {

	public ActionType move;
	public int nodeID;

    /**
     *
     * @param move either pickup or move
     * @param nodeID target node id
     */
	public Action(ActionType move, int nodeID){
		this.move = move;
		this.nodeID = nodeID;
	}

    /**
     * Basic toString()
     * @return action with node id as a string
     */
	public String toString(){
		return move.toString()+ " " + nodeID;
	}
	
}
