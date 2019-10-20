/* 
 * Copyright 2019 Bianca Antonela Glavan - biancaantonela.glavan.alum@iescamp.es.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.japo.java.main;

import java.util.Calendar;
import java.util.Locale;
import java.util.Scanner;
import java.util.Random;

/**
 *
 * @author Bianca Antonela Glavan - biancaantonela.glavan.alum@iescamp.es
 */
public class Main {

   
    public static final Random RND = new Random();

    public static void main(String[] args) {

        Calendar cal = Calendar.getInstance();
        
         System.out.println("Fecha del sistema.......: " + cal.get(cal.DAY_OF_MONTH) + "/" + (cal.get(cal.MONTH) + 1) + "/" + cal.get(cal.YEAR));
         
         
         //otra forma
         //printf("Fecha del sistema....: %02d/%02d%d%n", d, m, a);

    }

}
