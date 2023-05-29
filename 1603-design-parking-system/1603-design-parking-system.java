class ParkingSystem {

    int b = 0, m = 0, s = 0;
    
    public ParkingSystem(int big, int medium, int small) {
        b = big;
        m = medium;
        s = small;
    }
    
    public boolean addCar(int n) {
        
        if(n == 1){
            // big
            if(b <= 0) return false;
            b -= 1;
        }
        else if(n == 2){
            //medium
            if(m <= 0) return false;
            m -= 1;
        }
        else if(n == 3){
            //small
            if(s <= 0) return false;
            s -= 1;
        }
        return true;
    }
}

/**
 * Your ParkingSystem object will be instantiated and called as such:
 * ParkingSystem obj = new ParkingSystem(big, medium, small);
 * boolean param_1 = obj.addCar(carType);
 */