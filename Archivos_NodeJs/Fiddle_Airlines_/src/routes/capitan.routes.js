const { Router } = require('express')
const router = Router()

const { 
    rendercapitanFormulario, 
    crearNuevocapitan, 
    rendercapitan, 
    renderEditarcapitan, 
    updatecapitan, 
    eliminarcapitans 
} = require('../controllers/capitan.controller')

//nuevo capitan
router.get('/capitan/add', rendercapitanFormulario)
router.post('/capitan/nuevo-capitan', crearNuevocapitan)

// get todos capitan
router.get('/capitan/', rendercapitan)

// editar capitan
router.get('/capitan/editar/:id', renderEditarcapitan)
router.put('/capitan/editar/:id', updatecapitan)

//eliminar
router.delete('/capitan/delete/:id', eliminarcapitans)
module.exports = router