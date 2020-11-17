const { Router } = require('express')
const router = Router()

const { 
    renderaerolineaFormulario, 
    crearNuevoaerolinea, 
    renderaerolinea, 
    renderEditaraerolinea, 
    updateaerolinea, 
    eliminaraerolineas 
} = require('../controllers/aerolinea.controller')

//nuevo aerolinea
router.get('/aerolinea/add', renderaerolineaFormulario)
router.post('/aerolinea/nueva-aerolinea', crearNuevoaerolinea)

// get todos aerolinea
router.get('/aerolinea/', renderaerolinea)

// editar aerolinea
router.get('/aerolinea/editar/:id', renderEditaraerolinea)
router.put('/aerolinea/editar/:id', updateaerolinea)

//eliminar
router.delete('/aerolinea/delete/:id', eliminaraerolineas)
module.exports = router