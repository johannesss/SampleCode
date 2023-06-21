/*
BSD 3-Clause License

Copyright (c) 2022, Finansiell ID-Teknik BID AB
All rights reserved.

Redistribution and use in source and binary forms, with or without
modification, are permitted provided that the following conditions are met:

1. Redistributions of source code must retain the above copyright notice, this
   list of conditions and the following disclaimer.

2. Redistributions in binary form must reproduce the above copyright notice,
   this list of conditions and the following disclaimer in the documentation
   and/or other materials provided with the distribution.

3. Neither the name of the copyright holder nor the names of its
   contributors may be used to endorse or promote products derived from
   this software without specific prior written permission.

THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS "AS IS"
AND ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE
IMPLIED WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE ARE
DISCLAIMED. IN NO EVENT SHALL THE COPYRIGHT HOLDER OR CONTRIBUTORS BE LIABLE
FOR ANY DIRECT, INDIRECT, INCIDENTAL, SPECIAL, EXEMPLARY, OR CONSEQUENTIAL
DAMAGES (INCLUDING, BUT NOT LIMITED TO, PROCUREMENT OF SUBSTITUTE GOODS OR
SERVICES; LOSS OF USE, DATA, OR PROFITS; OR BUSINESS INTERRUPTION) HOWEVER
CAUSED AND ON ANY THEORY OF LIABILITY, WHETHER IN CONTRACT, STRICT LIABILITY,
OR TORT (INCLUDING NEGLIGENCE OR OTHERWISE) ARISING IN ANY WAY OUT OF THE USE
OF THIS SOFTWARE, EVEN IF ADVISED OF THE POSSIBILITY OF SUCH DAMAGE.

*/

package com.bankid.codefront.models.service;

/**
 * The completion data returned from BankIDService.
 */
public class CompletionResult {

    private final String name;
    private final String personalNumber;
    private final String signedText;

    /**
     * Create completion result.
     * @param name the name.
     * @param personalNumber the personal number.
     * @param signedText the text shown to the user when authenticated or signed the transaction.
     */
    public CompletionResult(String name, String personalNumber, String signedText) {
        this.name = name;
        this.personalNumber = personalNumber;
        this.signedText = signedText;
    }

    /**
     * Returns the name.
     * @return the name.
     */
    public String getName() {
        return this.name;
    }

    /**
     * Returns the personal number.
     * @return the personal number.
     */
    public String getPersonalNumber() {
        return this.personalNumber;
    }

    /**
     * Returns the signed text.
     * @return the signed text.
     */
    public String getSignedText() {
        return this.signedText;
    }
}
