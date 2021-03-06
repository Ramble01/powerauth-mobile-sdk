/*
 * Copyright 2017 Lime - HighTech Solutions s.r.o.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package io.getlime.security.powerauth.networking.endpoints;

import com.google.gson.reflect.TypeToken;

import io.getlime.security.powerauth.networking.interfaces.IEndpointDefinition;
import io.getlime.security.powerauth.rest.api.model.response.TokenRemoveResponse;

public class PA2RemoveTokenEndpoint implements IEndpointDefinition<TokenRemoveResponse> {

    private String baseUrl;

    /**
     * Create a new remove token endpoint with given PowerAuth 2.1 API base URL.
     * @param baseUrl Base URL of the PA2.1 API endpoints.
     */
    public PA2RemoveTokenEndpoint(String baseUrl) {
        this.baseUrl = baseUrl;
    }

    public static final String REMOVE_TOKEN = "/pa/token/remove";

    @Override
    public String getEndpoint() {
        return baseUrl + REMOVE_TOKEN;
    }

    @Override
    public TypeToken<TokenRemoveResponse> getResponseType() {
        return TypeToken.get(TokenRemoveResponse.class);
    }
}
