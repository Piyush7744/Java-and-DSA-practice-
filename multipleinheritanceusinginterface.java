class multipleinheritanceusinginterface{
    public static void main(String args[]){
        Bear b = new Bear();
        b.eatgrass();
        b.eatmeat();
    }
}

    interface herbivore{
        void eatgrass();
    }

    interface carnivore{
        void eatmeat();
    }

    class Bear implements herbivore , carnivore{
        public void eatgrass(){
            System.out.println("eats grass");
        }

        public void eatmeat(){
            System.out.println("Eat meat");
        }   
    }
