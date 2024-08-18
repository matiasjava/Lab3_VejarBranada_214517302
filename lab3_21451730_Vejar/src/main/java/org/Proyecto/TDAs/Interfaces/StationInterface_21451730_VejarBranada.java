package org.Proyecto.TDAs.Interfaces;

/**
 * Interfaz donde se nombran los metodos utilizados por Station.
 */
public interface StationInterface_21451730_VejarBranada {

        /**
         * Retorna el id
         *
         * @return id:int
         */
        public int getId();

        /**
         * Retorna el name
         *
         * @return name:String
         */
        public String getName();

        /**
         * Retorna el type
         *
         * @return type:String
         */
        public String getType();

        /**
         * Retorna StopTime
         *
         * @return stopTime:int
         */
        public int getStopTime();

        /**
         * Coloca el id
         *
         * @param id:int
         */
        public void setId(int id);

        /**
         * Coloca name
         *
         * @param name:String
         */
        public void setName(String name);

        /**
         * Coloca el Type
         *
         * @param type:int
         */
        public void setType(String type);

        /**
         * Coloca el stoptime
         *
         * @param stopTime:int
         */
        public void setStopTime(int stopTime);

}

