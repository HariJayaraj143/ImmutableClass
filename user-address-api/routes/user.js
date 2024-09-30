const express = require('express')
const router = express.Router()
const User = require('../models/user')
const Address = require('../models/address')

router.post('/add-user', async (req, res) => {
  try {
    const {name, address} = req.body

    if (!name || !address) {
      return res.status(400).send('Name and Address are required')
    }

    const user = await User.create({name})
    await Address.create({address, userId: user.id})

    res.status(201).send('User and Address added successfully')
  } catch (error) {
    res.status(500).send('Error occurred: ' + error.message)
  }
})

module.exports = router
