/*
 * Copyright 2017-2018 original authors
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

package io.micronaut.configuration.vertx.pg.client;

import io.micronaut.context.annotation.ConfigurationBuilder;
import io.micronaut.context.annotation.ConfigurationProperties;
import io.vertx.pgclient.PgConnectOptions;
import io.vertx.sqlclient.PoolOptions;

/**
 * The configuration class for Vertx Pg Client PoolOptions.
 *
 */
@ConfigurationProperties(PgClientSettings.PREFIX)
public class PgClientConfiguration {

    @ConfigurationBuilder
    protected PgConnectOptions connectOptions = new PgConnectOptions();

    @ConfigurationBuilder
    protected PoolOptions poolOptions = new PoolOptions();

    protected String uri;

    /**
     * @return The Pg connection URI.
     */
    public String getUri() {
        return uri;
    }

    /**
     *
     * @return The options for configuring a connection.
     */
    public PgConnectOptions getConnectOptions() { return connectOptions; }

    /**
     *
     * @return The options for configuring a connection pool.
     */
    public PoolOptions getPoolOptions() { return poolOptions; }
}
