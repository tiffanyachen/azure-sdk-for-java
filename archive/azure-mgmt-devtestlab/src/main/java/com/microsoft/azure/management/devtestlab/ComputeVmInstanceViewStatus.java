/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.devtestlab;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Status information about a virtual machine.
 */
public class ComputeVmInstanceViewStatus {
    /**
     * Gets the status Code.
     */
    @JsonProperty(value = "code")
    private String code;

    /**
     * Gets the short localizable label for the status.
     */
    @JsonProperty(value = "displayStatus")
    private String displayStatus;

    /**
     * Gets the message associated with the status.
     */
    @JsonProperty(value = "message")
    private String message;

    /**
     * Get the code value.
     *
     * @return the code value
     */
    public String code() {
        return this.code;
    }

    /**
     * Set the code value.
     *
     * @param code the code value to set
     * @return the ComputeVmInstanceViewStatus object itself.
     */
    public ComputeVmInstanceViewStatus withCode(String code) {
        this.code = code;
        return this;
    }

    /**
     * Get the displayStatus value.
     *
     * @return the displayStatus value
     */
    public String displayStatus() {
        return this.displayStatus;
    }

    /**
     * Set the displayStatus value.
     *
     * @param displayStatus the displayStatus value to set
     * @return the ComputeVmInstanceViewStatus object itself.
     */
    public ComputeVmInstanceViewStatus withDisplayStatus(String displayStatus) {
        this.displayStatus = displayStatus;
        return this;
    }

    /**
     * Get the message value.
     *
     * @return the message value
     */
    public String message() {
        return this.message;
    }

    /**
     * Set the message value.
     *
     * @param message the message value to set
     * @return the ComputeVmInstanceViewStatus object itself.
     */
    public ComputeVmInstanceViewStatus withMessage(String message) {
        this.message = message;
        return this;
    }

}
