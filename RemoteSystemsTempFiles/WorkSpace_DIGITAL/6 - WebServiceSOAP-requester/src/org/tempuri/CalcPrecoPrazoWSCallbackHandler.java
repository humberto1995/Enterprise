
/**
 * CalcPrecoPrazoWSCallbackHandler.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.2  Built on : Apr 17, 2012 (05:33:49 IST)
 */

    package org.tempuri;

    /**
     *  CalcPrecoPrazoWSCallbackHandler Callback class, Users can extend this class and implement
     *  their own receiveResult and receiveError methods.
     */
    public abstract class CalcPrecoPrazoWSCallbackHandler{



    protected Object clientData;

    /**
    * User can pass in any object that needs to be accessed once the NonBlocking
    * Web service call is finished and appropriate method of this CallBack is called.
    * @param clientData Object mechanism by which the user can pass in user data
    * that will be avilable at the time this callback is called.
    */
    public CalcPrecoPrazoWSCallbackHandler(Object clientData){
        this.clientData = clientData;
    }

    /**
    * Please use this constructor if you don't want to set any clientData
    */
    public CalcPrecoPrazoWSCallbackHandler(){
        this.clientData = null;
    }

    /**
     * Get the client data
     */

     public Object getClientData() {
        return clientData;
     }

        
           /**
            * auto generated Axis2 call back method for calcPrecoPrazoData method
            * override this method for handling normal response from calcPrecoPrazoData operation
            */
           public void receiveResultcalcPrecoPrazoData(
                    org.tempuri.CalcPrecoPrazoWSStub.CalcPrecoPrazoDataResponse result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from calcPrecoPrazoData operation
           */
            public void receiveErrorcalcPrecoPrazoData(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for calcPrecoPrazoRestricao method
            * override this method for handling normal response from calcPrecoPrazoRestricao operation
            */
           public void receiveResultcalcPrecoPrazoRestricao(
                    org.tempuri.CalcPrecoPrazoWSStub.CalcPrecoPrazoRestricaoResponse result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from calcPrecoPrazoRestricao operation
           */
            public void receiveErrorcalcPrecoPrazoRestricao(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for calcPrazoRestricao method
            * override this method for handling normal response from calcPrazoRestricao operation
            */
           public void receiveResultcalcPrazoRestricao(
                    org.tempuri.CalcPrecoPrazoWSStub.CalcPrazoRestricaoResponse result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from calcPrazoRestricao operation
           */
            public void receiveErrorcalcPrazoRestricao(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for calcPrecoFAC method
            * override this method for handling normal response from calcPrecoFAC operation
            */
           public void receiveResultcalcPrecoFAC(
                    org.tempuri.CalcPrecoPrazoWSStub.CalcPrecoFACResponse result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from calcPrecoFAC operation
           */
            public void receiveErrorcalcPrecoFAC(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for calcPreco method
            * override this method for handling normal response from calcPreco operation
            */
           public void receiveResultcalcPreco(
                    org.tempuri.CalcPrecoPrazoWSStub.CalcPrecoResponse result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from calcPreco operation
           */
            public void receiveErrorcalcPreco(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for calcPrecoData method
            * override this method for handling normal response from calcPrecoData operation
            */
           public void receiveResultcalcPrecoData(
                    org.tempuri.CalcPrecoPrazoWSStub.CalcPrecoDataResponse result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from calcPrecoData operation
           */
            public void receiveErrorcalcPrecoData(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for calcPrazo method
            * override this method for handling normal response from calcPrazo operation
            */
           public void receiveResultcalcPrazo(
                    org.tempuri.CalcPrecoPrazoWSStub.CalcPrazoResponse result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from calcPrazo operation
           */
            public void receiveErrorcalcPrazo(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for calcPrazoData method
            * override this method for handling normal response from calcPrazoData operation
            */
           public void receiveResultcalcPrazoData(
                    org.tempuri.CalcPrecoPrazoWSStub.CalcPrazoDataResponse result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from calcPrazoData operation
           */
            public void receiveErrorcalcPrazoData(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for calcPrecoPrazo method
            * override this method for handling normal response from calcPrecoPrazo operation
            */
           public void receiveResultcalcPrecoPrazo(
                    org.tempuri.CalcPrecoPrazoWSStub.CalcPrecoPrazoResponse result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from calcPrecoPrazo operation
           */
            public void receiveErrorcalcPrecoPrazo(java.lang.Exception e) {
            }
                


    }
    