package org.grails.rabbitmq.test


class ConnectionFactoryInitializationTests extends GroovyTestCase {
    
    def rabbitMQConnectionFactory
    
    void testConnectionFactoryInitialization() {
        assertEquals 'guest', rabbitMQConnectionFactory.username
        assertEquals 'guest', rabbitMQConnectionFactory.password
        assertEquals 10, rabbitMQConnectionFactory.channelCacheSize
    }
    
}