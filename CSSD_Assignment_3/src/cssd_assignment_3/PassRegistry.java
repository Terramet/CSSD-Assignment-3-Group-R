
package cssd_assignment_3;

import java.util.ArrayList;

class PassRegistry {
	
	public ArrayList<Pass> GetPasses() {
		return passes;
	}
        
        public void add(Pass pass) {
            passes.add(pass);
        }

        public boolean isCovered() {
            for (int ix = 0; ix != passes.size(); ++ix) {
                if(passes.get(ix).isCovered())
                    return true;
            }
            
            return true;
        }
        
	private ArrayList<Pass> passes;
}
