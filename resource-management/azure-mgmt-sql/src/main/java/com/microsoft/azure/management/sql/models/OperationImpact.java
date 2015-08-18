/**
 * 
 * Copyright (c) Microsoft and contributors.  All rights reserved.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *   http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * 
 * See the License for the specific language governing permissions and
 * limitations under the License.
 * 
 */

// Warning: This code was generated by a tool.
// 
// Changes to this file may cause incorrect behavior and will be lost if the
// code is regenerated.

package com.microsoft.azure.management.sql.models;

/**
* Represents impact of an operation, both in absolute and relative terms.
*/
public class OperationImpact {
    private Double changeValueAbsolute;
    
    /**
    * Optional. Gets the absolute impact to dimension.
    * @return The ChangeValueAbsolute value.
    */
    public Double getChangeValueAbsolute() {
        return this.changeValueAbsolute;
    }
    
    /**
    * Optional. Gets the absolute impact to dimension.
    * @param changeValueAbsoluteValue The ChangeValueAbsolute value.
    */
    public void setChangeValueAbsolute(final Double changeValueAbsoluteValue) {
        this.changeValueAbsolute = changeValueAbsoluteValue;
    }
    
    private Double changeValueRelative;
    
    /**
    * Optional. Gets the relative impact to dimension (null if not applicable)
    * @return The ChangeValueRelative value.
    */
    public Double getChangeValueRelative() {
        return this.changeValueRelative;
    }
    
    /**
    * Optional. Gets the relative impact to dimension (null if not applicable)
    * @param changeValueRelativeValue The ChangeValueRelative value.
    */
    public void setChangeValueRelative(final Double changeValueRelativeValue) {
        this.changeValueRelative = changeValueRelativeValue;
    }
    
    private String name;
    
    /**
    * Optional. Gets the name of the impact dimension.
    * @return The Name value.
    */
    public String getName() {
        return this.name;
    }
    
    /**
    * Optional. Gets the name of the impact dimension.
    * @param nameValue The Name value.
    */
    public void setName(final String nameValue) {
        this.name = nameValue;
    }
    
    private String unit;
    
    /**
    * Optional. Gets the unit in which estimated impact to dimension is
    * measured.
    * @return The Unit value.
    */
    public String getUnit() {
        return this.unit;
    }
    
    /**
    * Optional. Gets the unit in which estimated impact to dimension is
    * measured.
    * @param unitValue The Unit value.
    */
    public void setUnit(final String unitValue) {
        this.unit = unitValue;
    }
}