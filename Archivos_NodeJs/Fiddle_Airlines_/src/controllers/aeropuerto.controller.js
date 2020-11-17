const aeropuertosCtrl = {}

aeropuertosCtrl.renderaeropuertoFormulario = (req, res) => {
    res.render('aeropuerto/nuevo-aeropuerto')
}

aeropuertosCtrl.crearNuevoaeropuerto = (req, res) => {
    console.log(req.body)
    res.send('aeropuerto nuevo')
}

aeropuertosCtrl.renderaeropuerto = (req, res) => {
    res.send('render aeropuerto')
}

aeropuertosCtrl.renderEditaraeropuerto = (req, res) => {
    res.send('Editar aeropuerto')
}

aeropuertosCtrl.updateaeropuerto = (req, res) => {
    res.send('update aeropuerto')
}

aeropuertosCtrl.eliminaraeropuertos = (req, res) => {
    res.send('aeropuerto eliminado')
}
module.exports = aeropuertosCtrl