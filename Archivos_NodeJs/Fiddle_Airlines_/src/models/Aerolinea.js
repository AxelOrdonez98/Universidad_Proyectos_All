const {Schema, model} = require('mongoose')
const Aerolinea = new Schema({
    Aerolinia = {
        Nombre_Aerolinia:{
            type: String,
            require: true
        },
        Avion:[{
            Numero_de_Avion:{
                type: String,
                require: true
            },
            Horas_de_vuelo:{
                type: String,
                require: true
            },
            Capacidad_de_Combustible:{
                type: String,
                require: true
            },
            Aerolinia_Perteneciente:{
                type: String,
                require: true
            },
            Numero_de_Reparaciones:{
                type: String,
                require: true
            },
            Capacidad_Maxima_de_Pasajeros:{
                type: String,
                require: true
            },
            Capacidad_Maxima_de_Peso_Kg:{
                type: String,
                require: true
            },
            Tamano_Avion_MTS_Cuadrados:{
                type: String,
                require: true
            },
            Ciudad_de_Origen:{
                type: String,
                require: true
            },
            Tipo_de_Avion:{
                type: String,
                require: true
            }
        }],
        Numero_de_Capitanes_Contratados:{
            type: String,
            require: true
        },
        Datos_Personales_Capitan:[{
            Nombre:{
                type: String,
                require: true
            },
            Apellidos:{
                type: String,
                require: true
            },
            Tipo_de_Sangre:{
                type: String,
                require: true
            },
            Vacunas:{
                type: String,
                require: true
            },
            Donante_de_Organos:{
                type: String,
                require: true
            },
            Religion:{
                type: String,
                require: true
            },
            Nacionalidad:{
                type: String,
                require: true
            },
            Estado_Civil:{
                type: String,
                require: true
            },
            Tipo_De_Aprendizaje_Vuelo:{
                type: String,
                require: true
            },
            Numero_De_Cedula_Profecional:{
                type: String,
                require: true
            },
            Direccion_Fiscal_Autorizada_Capitan:[{
                Pais:{
                    type: String,
                    require: true
                },
                Ciudad:{
                    type: String,
                    require: true
                },
                Calle:{
                    type: String,
                    require: true
                },
                Numero_de_Domicilio:{
                    type: String,
                    require: true
                },
                Codigo_Postal:{
                    type: String,
                    require: true
                },
                Colonia:{
                    type: String,
                    require: true
                },
                Referencia_Calle_1:{
                    type: String,
                    require: true
                },
                Referencia_Calle_2:{
                    type: String,
                    require: true
                },
                Tipo_de_Resincia:{
                    type: String,
                    require: true
                },
                Casa_Propia_Renta:{
                    type: String,
                    require: true
                }
            }]
        }],
        Numero_de_Sobrecargo_Contratados:{
            type: String,
            require: true
        },
        Datos_Personales_Sobrecargo:[{
            Nombre:{
                type: String,
                require: true
            },
            Apellidos:{
                type: String,
                require: true
            },
            Sexo:{
                type: String,
                require: true
            },
            Tipo_de_Sangre:{
                type: String,
                require: true
            },
            Vacunas:{
                type: String,
                require: true
            },
            Donante_de_Organos:{
                type: String,
                require: true
            },
            Religion:{
                type: String,
                require: true
            },
            Nacionalidad:{
                type: String,
                require: true
            },
            Estado_Civil:{
                type: String,
                require: true
            },
            Tipo_De_Aprendizaje_Vuelo:{
                type: String,
                require: true
            },
            Numero_De_Cedula_Profecional:{
                type: String,
                require: true
            }
        }],
        Tipos_de_Vuelo:{
            type: String,
            require: true
        },
        Numero_de_Permiso:{
            type: String,
            require: true
        }
    }
},{
    timestamps: true
})
module.exports = model('Aerolinea', Aerolinea)