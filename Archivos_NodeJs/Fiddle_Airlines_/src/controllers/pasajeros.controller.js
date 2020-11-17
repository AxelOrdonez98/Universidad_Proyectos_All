const pasajerosCtrl = {}

pasajerosCtrl.renderPasajeroFormulario = (req, res) => {
    res.render('pasajero/nuevo-pasajero')
}

pasajerosCtrl.crearNuevoPasajero = (req, res) => {
    console.log(req.body)
    res.send('Pasajero nuevo')
}

pasajerosCtrl.renderPasajero = (req, res) => {
    res.send('render pasajero')
}

pasajerosCtrl.renderEditarPasajero = (req, res) => {
    res.send('Editar pasajero')
}

pasajerosCtrl.updatePasajero = (req, res) => {
    res.send('update pasajero')
}

pasajerosCtrl.eliminarPasajeros = (req, res) => {
    res.send('Pasajero eliminado')
}
module.exports = pasajerosCtrl