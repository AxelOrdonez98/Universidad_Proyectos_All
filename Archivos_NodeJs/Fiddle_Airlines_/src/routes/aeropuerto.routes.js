const { Router } = require('express')
const router = Router()

const { 
    renderaeropuertoFormulario, 
    crearNuevoaeropuerto, 
    renderaeropuerto, 
    renderEditaraeropuerto, 
    updateaeropuerto, 
    eliminaraeropuertos 
} = require('../controllers/aeropuerto.controller')

//nuevo aeropuerto
router.get('/aeropuerto/add', renderaeropuertoFormulario)
router.post('/aeropuerto/nuevo-aeropuerto', crearNuevoaeropuerto)

// get todos aeropuerto
router.get('/aeropuerto/', renderaeropuerto)

// editar aeropuerto
router.get('/aeropuerto/editar/:id', renderEditaraeropuerto)
router.put('/aeropuerto/editar/:id', updateaeropuerto)

//eliminar
router.delete('/aeropuerto/delete/:id', eliminaraeropuertos)
module.exports = router