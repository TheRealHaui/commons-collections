/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.apache.commons.collections4.functors;

import org.junit.Test;

import static org.junit.Assert.*;


/**
 * Unit tests for class {@link DefaultEquator}.
 *
 * @date 25.06.2017
 * @see DefaultEquator
 **/
public class DefaultEquatorTest {


    @Test
    public void testHash() {

        DefaultEquator<Object> defaultEquator = DefaultEquator.defaultEquator();

        assertEquals(-1, DefaultEquator.HASHCODE_NULL);
        assertEquals(-1, defaultEquator.hash( null));

    }


    @Test
    public void testEquate() {

        DefaultEquator<String> defaultEquator = DefaultEquator.defaultEquator();
        
        assertEquals(-1, DefaultEquator.HASHCODE_NULL);
        assertFalse(defaultEquator.equate(null, ""));

    }


}