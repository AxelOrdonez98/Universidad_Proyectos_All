const { Router } = require('express')
const router = Router()

const { 
    renderPasajeroFormulario, 
    crearNuevoPasajero, 
    renderPasajero, 
    renderEditarPasajero, 
    updatePasajero, 
    eliminarPasajeros 
} = require('../controllers/pasajeros.controller')

//nuevo pasajero
router.get('/pasajero/add', renderPasajeroFormulario)
router.post('/pasajero/nuevo-pasajero', crearNuevoPasajero)

// get todos pasajero
router.get('/pasajero/', renderPasajero)

// editar pasajero
router.get('/pasajero/editar/:id', renderEditarPasajero)
router.put('/pasajero/editar/:id', updatePasajero)

//eliminar
router.delete('/pasajero/delete/:id', eliminarPasajeros)
module.exports = router