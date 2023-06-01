package com.example.sudo.sender

import com.amazonaws.services.sns.AmazonSNSAsync
import com.amazonaws.services.sns.model.PublishRequest
import com.example.sudo.config.SnsConfig

class SnsSender {

    companion object{
        private const val serviceName: String = "Let's Giri"
        private lateinit var profile: String
        private lateinit var config: SnsConfig
        private lateinit var amazonSNSAsync: AmazonSNSAsync


        fun init(config: SnsConfig, profile: String){
            ....
        }

        fun publishRequest(message: String): PublishRequest {
            ....
        }

        fun send(message: String, title: String){
            ....
        }
    }
}